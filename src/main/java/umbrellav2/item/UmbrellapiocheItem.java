
package umbrellav2.item;

import umbrellav2.itemgroup.UmbrellaItemGroup;

import umbrellav2.Umbrellav2ModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Umbrellav2ModElements.ModElement.Tag
public class UmbrellapiocheItem extends Umbrellav2ModElements.ModElement {
	@ObjectHolder("umbrellav2:umbrellapioche")
	public static final Item block = null;
	public UmbrellapiocheItem(Umbrellav2ModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4999;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 85;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(UmbrellapiocheItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(UmbrellaItemGroup.tab)) {
		}.setRegistryName("umbrellapioche"));
	}
}
