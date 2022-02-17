package top.hendrixshen.MiniHUDInjector.mixin;

import fi.dy.masa.minihud.event.RenderHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import top.hendrixshen.magiclib.untils.language.I18n;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Mixin(value = RenderHandler.class, remap = false)
public class RenderHandlerMixin {
    private static final Pattern TOKEN_PATTERN = Pattern.compile("[\\w ]+: ");
    @Redirect(
            method = "addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Ljava/lang/String;format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;"
            )
    )
    private String onStringFormat(String format, Object[] args) {
        return I18n.translate(format, args);
    }

    @ModifyVariable(
            method = "addLine(Ljava/lang/String;)V",
            at = @At(
                    value = "HEAD"
            ),
            argsOnly = true
    )
    private String onAddLine(String string) {
        Matcher matcher = TOKEN_PATTERN.matcher(string);
        int start = 0;
        List<String> keys = new ArrayList<>();
        while (matcher.find(start)) {
            keys.add(matcher.group());
            start = matcher.end();
        }
        for (String key: keys) {
            string = string.replace(key, I18n.getOriginal(key));
        }
        return string;
    }
}
