package cn.forcecat.minecraft.cus.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class TestGuoItem extends Item {

    public TestGuoItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        // 默认为白色文本
        tooltip.add( new TranslatableText("item.cus.test_guo.tooltip") );

        // 格式化为红色文本
        tooltip.add( new TranslatableText("item.cus.test_guo.tooltip").formatted(Formatting.RED) );
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        DoSomething(user);

        user.getItemCooldownManager().set(this, 15);
        return super.use(world, user, hand);
    }
    private void DoSomething(PlayerEntity user) {

    }
}
