package ctn.imaginarycraft.mixin;

import net.neoforged.neoforge.client.model.generators.ModelFile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ModelFile.class)
public interface ModelFileMixin {
  @Invoker("exists")
  boolean getExists();
}
