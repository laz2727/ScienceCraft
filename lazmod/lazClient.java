package lazmod;

import net.minecraftforge.client.MinecraftForgeClient;

public class lazClient extends lazProxy
	{
	@Override
    public void registerRenderers ()
    	{
        MinecraftForgeClient.preloadTexture(ITEMS1_PNG);
        
        MinecraftForgeClient.preloadTexture(BLOCKS1_PNG);
        }
	}