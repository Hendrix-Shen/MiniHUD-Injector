package PhoeniX.MiniHUDExtra.mixin;

import fi.dy.masa.minihud.event.RenderHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = RenderHandler.class, remap = false)
public class RenderHandlerMixin {
    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "%d fps"
        )
    )
    private static String FPS(String value) {
        return "%d 帧";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Mem: % 2d%% %03d/%03dMB | Allocated: % 2d%% %03dMB"
        )
    )
    private static String Memory(String value) {
        return "内存: % 2d%% %03d/%03d兆字节 | 已分配: % 2d%% %03d兆字节";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Date formatting failed - Invalid date format string?"
        )
    )
    private static String DateFormatFail(String value) {
        return "日期格式化失败 - 非法的日期字符串?";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "World time: %5d - total: %d"
        )
    )
    private static String WorldTime(String value) {
        return "世界时间: %5d - 总计: %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Day time %% %d: %5d"
        )
    )
    private static String DayTimeMod(String value) {
        return "当前时间 %% %d: %5d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Total time %% %d: %5d"
        )
    )
    private static String TotalTimeMod(String value) {
        return "总计时间 %% %d: %5d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Server TPS: %s%.1f%s (MSPT*: %s%.1f%s)"
        )
    )
    private static String ServerTPSNotExact(String value) {
        return "服务器 TPS: %s%.1f%s (MSPT*: %s%.1f%s)";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Server TPS: %s%.1f%s MSPT: %s%.1f%s"
        )
    )
    private static String ServerTPS(String value) {
        return "服务器 TPS: %s%.1f%s (MSPT: %s%.1f%s)";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Server TPS: <no valid data>"
        )
    )
    private static String ServerTPSNoData(String value) {
        return "服务器 TPS: <无效的数据>";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Ping: "
        )
    )
    private static String Ping(String value) {
        return "延迟: ";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = " ms"
        )
    )
    private static String ms(String value) {
        return " 毫秒";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Block: %d, %d, %d within Sub-Chunk: %d, %d, %d"
        )
    )
    private static String BlockEx(String value) {
        return "方块坐标: %d, %d, %d 子区块: %d, %d, %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "BBS: %.2f"
        )
    )
    private static String BBS(String value) {
        return "方块破坏速度: %.2f";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Distance: %.2f (x: %.2f y: %.2f z: %.2f) [to x: %.2f y: %.2f z: %.2f]"
        )
    )
    private static String Distance(String value) {
        return "距离: %.2f (x: %.2f y: %.2f z: %.2f) [到 x: %.2f y: %.2f z: %.2f]";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
             stringValue = "Invalid"
        )
    )
    private static String Invalid(String value) {
        return "无效";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Negative Z"
        )
    )
    private static String NegativeZ(String value) {
        return "北-Z 轴负半轴方向";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Positive Z"
        )
    )
    private static String PositiveZ(String value) {
        return "南-Z 轴正半轴方向";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Negative X"
        )
    )
    private static String NegativeX(String value) {
        return "西-X 轴负半轴方向";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
             stringValue = "Positive X"
        )
    )
    private static String PositiveX(String value) {
        return "东-X 轴正半轴方向";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Facing: %s (%s)"
        )
    )
    private static String Facing(String value) {
        return "面朝: %s (%s)";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Client Light: %d (block: %d, sky: %d)"
        )
    )
    private static String ClientLight(String value) {
        return "客户端亮度等级: %d (方块: %d, 天空: %d)";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Server Light: %d (block: %d, sky: %d)"
        )
    )
    private static String ServerLight(String value) {
        return "服务端亮度等级: %d (方块: %d, 天空: %d)";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Bees: "
        )
    )
    private static String Bees(String value) {
        return "蜜蜂: ";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Honey: "
        )
    )
    private static String Honey(String value) {
        return "蜂蜜: ";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "speed: x: %.3f y: %.3f z: %.3f m/s"
        )
    )
    private static String SpeedZYX(String value) {
        return "速度: x: %.3f y: %.3f z: %.3f 米/秒";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "C: %d"
        )
    )
    private static String C(String value) {
        return "C: %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "TODO"
        )
    )
    private static String TODO(String value) {
        return "(该功能未完成)";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Server: %d / %d - Client: %s"
        )
    )
    private static String LoadChunkCounts(String value) {
        return "区块更新: %d / %d - 客户端: %s";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "P: %s"
        )
    )
    private static String ParticleCounts(String value) {
        return "粒子数量: %s";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Local Difficulty: %.2f // %.2f (Day %d)"
        )
    )
    private static String LocalDifficulty(String value) {
        return "本地难度: %.2f // %.2f (第 %d 天)";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Biome: "
        )
    )
    private static String Biome(String value) {
        return "生物群系: ";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Biome reg name: "
        )
    )
    private static String BiomeRegName(String value) {
        return "生物群系注册名: ";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Client world TE - L: %d, T: %d"
        )
    )
    private static String ClientTileEntity(String value) {
        return "客户端方块实体 - 大小: %d, 计算: %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Entities - Client: %d, Server: %d"
        )
    )
    private static String EntitiesClientCountsAndServerCounts(String value) {
        return "实体 - 客户端: %d, 服务端: %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Entities - Client: %d"
        )
    )
    private static String EntitiesClientCounts(String value) {
        return "实体 - 客户端: %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "YES"
        )
    )
    private static String Yes(String value) {
        return "是";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "NO"
        )
    )
    private static String No(String value) {
        return "否";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "<world seed not known>"
        )
    )
    private static String WorldSeedNotKnown(String value) {
        return "<未知种子>";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Slime chunk: "
        )
    )
    private static String SlimeChunk(String value) {
        return "史莱姆区块: ";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Entity: %s - HP: %.1f / %.1f"
        )
    )
    private static String EntityWithHP(String value) {
        return "实体: %s - 生命值: %.1f / %.1f";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Entity: %s"
        )
    )
    private static String Entity(String value) {
        return "实体: %s";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Entity reg name: %s"
        )
    )
    private static String EntityRegName(String value) {
        return "实体注册名: %s";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Looking at block: %d, %d, %d"
        )
    )
    private static String LookingAtBlock(String value) {
        return "指向的方块: %d, %d, %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Block: %d, %d, %d in Sub-Chunk: %d, %d, %d"
        )
    )
    private static String BlockLookAt(String value) {
        return "方块: %d, %d, %d 位于子区块: %d, %d, %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "yaw: %.1f"
        )
    )
    private static String Yaw(String value) {
        return "偏航角: %.1f";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "pitch: %.1f"
        )
    )
    private static String Pitch(String value) {
        return "俯仰角: %.1f";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "speed: %.3f m/s"
        )
    )
    private static String Speed(String value) {
        return "速度: %.3f 米/秒";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Block: %d, %d, %d"
        )
    )
    private static String BlockPos(String value) {
        return "方块: %d, %d, %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Sub-Chunk: %d, %d, %d"
        )
    )
    private static String BlockSubChunk(String value) {
        return "子区块: %d, %d, %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "Region: r.%d.%d"
        )
    )
    private static String BlockRegion(String value) {
        return "区域: %d, %d, %d";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "broken coordinate format string!"
        )
    )
    private static String CoordinateFormatFail(String value) {
        return "坐标格式化失败 - 非法的坐标字符串?";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "XYZ: %.2f / %.4f / %.2f"
        )
    )
    private static String Coordination(String value) {
        return "坐标: %.2f / %.4f / %.2f";
    }

    @ModifyConstant(
        method = "Lfi/dy/masa/minihud/event/RenderHandler;addLine(Lfi/dy/masa/minihud/config/InfoToggle;)V",
        constant = @Constant(
            stringValue = "%sdim: %s"
        )
    )
    private static String Dim(String value) {
        return "%s维度: %s";
    }
}
