package fr.miage.romain;

import java.io.File;
import java.io.FilenameFilter;

public class Exercice1 {

	public static void main(String[] args) {
	
		String pathFile = ".";
		
		new Exercice1().toStringFile(pathFile);

	}
	
	// Implémente le filtre de la classe externe
	public void toStringFile(String pathFile){
		
		for(File file : new File(pathFile).listFiles(new MonFiltre())){
			
			if(file.isDirectory()){
				toStringFile(file.getPath());
			} else {
				System.out.println(file.toString());
			}
			
		}
		
	}
	
	// Implémente le filtre de la classe interne de Exercice 1
	public void toStringFileInterne(String pathFile){
		
		for(File file : new File(pathFile).listFiles(new MonFiltre2())){
			
			if(file.isDirectory()){
				toStringFile(file.getPath());
			} else {
				System.out.println(file.toString());
			}
			
		}
		
	}
	
	// Implémente le filtre de la classe interne anonyme
	public void toStringFileAnonyme(String pathFile){
		
		for(File file : new File(pathFile).listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java") || new File(dir.getPath()+"/"+name).isDirectory();
			}
		})){
			
			if(file.isDirectory()){
				toStringFile(file.getPath());
			} else {
				System.out.println(file.toString());
			}
			
		}
		
	}
	
	private class MonFiltre2 implements FilenameFilter {

		private String regex;
		
		public MonFiltre2(String regex){
			this.regex=regex;
		}
		
		public MonFiltre2(){
			this.regex=".java";
		}
		
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(regex) || new File(dir.getPath()+"/"+name).isDirectory();
		}
		
	}

}
