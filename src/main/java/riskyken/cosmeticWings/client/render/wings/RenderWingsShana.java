package riskyken.cosmeticWings.client.render.wings;

import net.minecraft.entity.player.EntityPlayer;
import riskyken.cosmeticWings.client.lib.LibModels;
import riskyken.cosmeticWings.common.wings.WingsData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWingsShana implements IWingRenderer {
    
    @Override
    public void render(EntityPlayer player, WingsData wingData, int layer, float partialRenderTick) {
        LibModels.BIG_SHANA_WINGS.render(player, layer, wingData);
    }

    @Override
    public void postRender(EntityPlayer player, WingsData wingData, int layer, float partialRenderTick) {
    }

    @Override
    public void onTick(EntityPlayer player, WingsData wingData) {
        LibModels.BIG_SHANA_WINGS.onTick(player, 2, wingData);
    }
}
