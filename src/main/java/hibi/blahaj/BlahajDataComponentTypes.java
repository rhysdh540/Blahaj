package hibi.blahaj;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentSerialization;


public class BlahajDataComponentTypes {

	private static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, Blahaj.MOD_ID);
	public static final DeferredHolder<DataComponentType<?>, DataComponentType<Component>> OWNER =
		DATA_COMPONENT_TYPES.register("owner", () -> DataComponentType.<Component>builder()
			.persistent(ComponentSerialization.FLAT_CODEC)
			.networkSynchronized(ComponentSerialization.STREAM_CODEC)
			.cacheEncoding().build());

	public static void register(IEventBus modEventBus) {
		DATA_COMPONENT_TYPES.register(modEventBus);
	}

}
