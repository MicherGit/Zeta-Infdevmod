package net.textilemc.examplemod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleMod implements ModInitializer {
	public final File file = new File("test.txt");
	public final BufferedReader br = new BufferedReader(new FileReader(file));
	public final String modid = "concernedconcern";

	public ExampleMod() throws FileNotFoundException {
	}

	@Override
	public void onInitialize() {
		System.out.println("Hello Fabric world!");

	}
}
