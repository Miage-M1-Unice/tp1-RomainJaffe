package fr.miage.romain;

import java.io.File;

public class Exercice1 {

	public static void main(String[] args) {
	
		String pathFile = ".";
		
		toStringFile(pathFile);

	}
	
	public static void toStringFile(String pathFile){
		
		for(File file : new File(pathFile).listFiles(new MonFiltre())){
			
			if(file.isDirectory()){
				System.out.println(file.toString());
				toStringFile(file.getPath());
			} else {
				System.out.println(file.toString());
			}
			
		}
		
	}

}
