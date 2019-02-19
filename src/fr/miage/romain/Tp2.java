package fr.miage.romain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Tp2 {

	public static void analyseClasse(String nomClasse) throws ClassNotFoundException {
	    // R�cup�ration d'un objet de type Class correspondant au nom pass� en param�tres
	    Class cl = getClasse(nomClasse);

	    afficheEnTeteClasse(cl);

	    System.out.println();
	    afficheAttributs(cl);

	    System.out.println();
	    afficheConstructeurs(cl);

	    System.out.println();
	    afficheMethodes(cl);

	    // L'accolade fermante de fin de classe !
	    System.out.println("}");
	  }


	  /** Retourne la classe dont le nom est pass� en param�tre */
	  public static Class getClasse(String nomClasse) throws ClassNotFoundException {
	    return Class.forName(nomClasse);
	  }

	  /** Cette m�thode affiche par ex "public class Toto extends Tata implements Titi, Tutu {" */
	  public static void afficheEnTeteClasse(Class cl) {
	    //  Affichage du modifier et du nom de la classe
	    // CODE A ECRIRE

	   // R�cup�ration de la superclasse si elle existe (null si cl est le type Object)
	    //Class supercl = // CODE A ECRIRE

	    // On ecrit le "extends " que si la superclasse est non nulle et
	    // diff�rente de Object
	    // CODE A ECRIRE

	    // Affichage des interfaces que la classe implemente
	    // CODE A ECRIRE

	    // Enfin, l'accolade ouvrante !
	    System.out.print(" {\n");
	    
	  }

	  public static void afficheAttributs(Class cl) {
		  
		System.out.println("Affichage des attributs");
		  
	    for(Field f : cl.getFields()){
	    	System.out.println(f.toString());
	    }
	  }

	  public static void afficheConstructeurs(Class cl) {
	    
		  System.out.println("Affichage des constructeurs");

		  
		  for(Constructor c : cl.getConstructors()){
			  System.out.println(c.toString());
		  }
	    
	  }

	  public static void afficheMethodes(Class cl) {
	    
		  System.out.println("Affichage des m�thodes");
		  
		  for(Method m : cl.getMethods()){
			  System.out.println(m.toString());
		  }
		  
	  }

	  public static String litChaineAuClavier() throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      return br.readLine();
	  }

	  public static void main(String[] args) {
	    boolean ok = false;

	    while(!ok) {
	      try {
	        System.out.print("Entrez le nom d'une classe (ex : java.util.Date): ");
	        String nomClasse = litChaineAuClavier();

	        analyseClasse(nomClasse);

	        ok = true;
	      } catch(ClassNotFoundException e) {
	        System.out.println("Classe non trouv�e.");
	      }catch(IOException e) {
	        System.out.println("Erreur d'E/S!");
	      }
	    }
	  }

}
