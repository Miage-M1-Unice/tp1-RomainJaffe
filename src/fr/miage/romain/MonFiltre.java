package fr.miage.romain;

import java.io.File;
import java.io.FilenameFilter;

public class MonFiltre implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}

}