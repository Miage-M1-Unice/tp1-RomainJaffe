package fr.miage.romain;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class MainClass {
	    
		public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {

	        URL[] urls = new URL[]{
	                new URL("file://C:/Users/Romain/workspace/TP1/bin/")};

	        URLClassLoader ucl = new URLClassLoader(urls);

	        Class c = ucl.loadClass("fr.miage.romain.Exercice1");

	        System.out.println("Class name " + c.getName());



	    }
	
}
