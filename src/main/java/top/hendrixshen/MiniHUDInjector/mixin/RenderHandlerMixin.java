package top.hendrixshen.MiniHUDInjector.mixin;

import fi.dy.masa.minihud.event.RenderHandler;
import net.minecraft.client.resource.language.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import top.hendrixshen.MiniHUDInjector.MiniHUDInjector;

@Mixin(value = RenderHandler.class, remap = false)
public class RenderHandlerMixin {
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
}
