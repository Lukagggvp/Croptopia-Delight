package net.raylirov.croptopiadelight;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CroptopiaDelight.MOD_ID)
public class CroptopiaDelight {

    public static final String MOD_ID = "croptopiadelight";

    private static final Logger LOGGER = LogManager.getLogger();

    public CroptopiaDelight() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
