
package umbrellav2.itemgroup;

import umbrellav2.item.UmbrellalogoItem;

import umbrellav2.Umbrellav2ModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@Umbrellav2ModElements.ModElement.Tag
public class UmbrellaItemGroup extends Umbrellav2ModElements.ModElement {
	public UmbrellaItemGroup(Umbrellav2ModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabumbrella") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(UmbrellalogoItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
