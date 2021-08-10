
package umbrellav2.item;

import umbrellav2.itemgroup.UmbrellaItemGroup;

import umbrellav2.Umbrellav2ModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Umbrellav2ModElements.ModElement.Tag
public class UmbrellalogoItem extends Umbrellav2ModElements.ModElement {
	@ObjectHolder("umbrellav2:umbrellalogo")
	public static final Item block = null;
	public UmbrellalogoItem(Umbrellav2ModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(UmbrellaItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("umbrellalogo");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
