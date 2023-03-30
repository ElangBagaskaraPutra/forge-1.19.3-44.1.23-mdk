package net.elangbagasp.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab.Builder("tutorialtab") {
        public ItemStack makeIcon() {
            return new ItemStack(Items.EVAN.get());
        }
    };
}
