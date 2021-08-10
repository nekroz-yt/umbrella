
package umbrellav2.potion;

import umbrellav2.Umbrellav2ModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;

@Umbrellav2ModElements.ModElement.Tag
public class VirusCPotion extends Umbrellav2ModElements.ModElement {
	@ObjectHolder("umbrellav2:virus_c")
	public static final Effect potion = null;
	@ObjectHolder("umbrellav2:virus_c")
	public static final Potion potionType = null;
	public VirusCPotion(Umbrellav2ModElements instance) {
		super(instance, 8);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("virus_c");
		}
	}

	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;
		public EffectCustom() {
			super(EffectType.HARMFUL, -205);
			setRegistryName("virus_c");
			potionIcon = new ResourceLocation(
					"umbrellav2:textures/kisspng-umbrella-corps-umbrella-corporation-logo-corporation-cliparts-5a85f751100e09.0436815615187290410658.png");
		}

		@Override
		public String getName() {
			return "effect.virus_c";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
