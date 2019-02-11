package fr.miage.romain;

import java.io.File;
import java.io.FilenameFilter;

public class MonFiltre implements FilenameFilter {

	private String regex;
	
	public MonFiltre(String regex){
		this.regex=regex;
	}
	
	public MonFiltre(){
		this.regex=".java";
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return name.contains(regex);
	}

}
