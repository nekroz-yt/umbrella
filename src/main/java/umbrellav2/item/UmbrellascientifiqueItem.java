
package umbrellav2.item;

import umbrellav2.itemgroup.UmbrellaItemGroup;

import umbrellav2.Umbrellav2ModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

@Umbrellav2ModElements.ModElement.Tag
public class UmbrellascientifiqueItem extends Umbrellav2ModElements.ModElement {
	@ObjectHolder("umbrellav2:umbrellascientifique_helmet")
	public static final Item helmet = null;
	@ObjectHolder("umbrellav2:umbrellascientifique_chestplate")
	public static final Item body = null;
	@ObjectHolder("umbrellav2:umbrellascientifique_leggings")
	public static final Item legs = null;
	@ObjectHolder("umbrellav2:umbrellascientifique_boots")
	public static final Item boots = null;
	public UmbrellascientifiqueItem(Umbrellav2ModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 20;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{4, 4, 5, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 5;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(UmbrellascientifiqueItem.helmet, (int) (1)),
						new ItemStack(UmbrellascientifiqueItem.body, (int) (1)), new ItemStack(UmbrellascientifiqueItem.legs, (int) (1)),
						new ItemStack(UmbrellascientifiqueItem.boots, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "umbrellascientifique";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(UmbrellaItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "umbrellav2:textures/models/armor/scientist__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("umbrellascientifique_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(UmbrellaItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "umbrellav2:textures/models/armor/scientist__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("umbrellascientifique_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(UmbrellaItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "umbrellav2:textures/models/armor/scientist__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("umbrellascientifique_boots"));
	}
}
