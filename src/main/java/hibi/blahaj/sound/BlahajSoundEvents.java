package hibi.blahaj.sound;

import hibi.blahaj.*;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.RandomSource;

import java.util.*;

public class BlahajSoundEvents {

	public static final SoundEvent[] BLOCK_CUDDLY_ITEM = Util.make(new SoundEvent[5], arr -> {
		Arrays.setAll(arr, i -> register("block.blahaj.cuddly_item.use." + (i + 1)));
	});
	public static final SoundEvent BLOCK_CUDDLY_ITEM_HIT = register("block.blahaj.cuddly_item.hit");

	private static SoundEvent register(String id) {
		return SoundEvent.createVariableRangeEvent(Blahaj.id(id));
	}

	public static void init() {
	}

	public static SoundEvent getRandomSqueak(RandomSource random) {
		return BLOCK_CUDDLY_ITEM[random.nextInt(BLOCK_CUDDLY_ITEM.length)];
	}

}
