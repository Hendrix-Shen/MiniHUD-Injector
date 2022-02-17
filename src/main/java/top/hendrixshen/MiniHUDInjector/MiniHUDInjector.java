package top.hendrixshen.MiniHUDInjector;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import top.hendrixshen.magiclib.untils.language.I18n;

public class MiniHUDInjector implements ModInitializer {
    public static final Logger logger = LogManager.getLogger(MiniHUDInjectorReference.getModId());

    public static Logger getLogger() {
        return logger;
    }

    @Override
    public void onInitialize() {
        I18n.getInstance().register(MiniHUDInjectorReference.getModId(), "zh_cn");

        logger.info(String.format("[%s]: Mod initialized - Version: %s (%s)", MiniHUDInjectorReference.getModName(), MiniHUDInjectorReference.getModVersion(), MiniHUDInjectorReference.getModVersionType()));
    }
}
