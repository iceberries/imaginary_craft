package ctn.imaginarycraft.init;

import ctn.imaginarycraft.core.ImaginaryCraft;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

public abstract class SoundEventsRegisterUtil {
  protected static DeferredHolder<SoundEvent, SoundEvent> registerForHolder(String id, String location) {
    return ModSoundEvents.REGISTRY.register(id, () -> SoundEvent.createVariableRangeEvent(ImaginaryCraft.modRl(location)));
  }
}
