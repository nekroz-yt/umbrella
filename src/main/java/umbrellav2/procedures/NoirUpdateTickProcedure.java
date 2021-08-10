package umbrellav2.procedures;

import umbrellav2.Umbrellav2ModElements;

import umbrellav2.Umbrellav2Mod;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.item.ExperienceOrbEntity;

import java.util.Map;

@Umbrellav2ModElements.ModElement.Tag
public class NoirUpdateTickProcedure extends Umbrellav2ModElements.ModElement {
	public NoirUpdateTickProcedure(Umbrellav2ModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				Umbrellav2Mod.LOGGER.warn("Failed to load dependency x for procedure NoirUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				Umbrellav2Mod.LOGGER.warn("Failed to load dependency y for procedure NoirUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				Umbrellav2Mod.LOGGER.warn("Failed to load dependency z for procedure NoirUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				Umbrellav2Mod.LOGGER.warn("Failed to load dependency world for procedure NoirUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 2));
		}
	}
}
