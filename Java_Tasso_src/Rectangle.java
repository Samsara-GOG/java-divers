/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Introduction : Naissance d'un programme
#	Exercice : I.4
#	Fichier  : Rectangle.java
#	Class    : Rectangle
*/

import java.util.* ;

public class Rectangle
{
	public static void main(String [] argument)
	{
		// Déclaration des variables représentant la surface, la largueur et la longueur
		double surface, largeur, longueur ;

		// Déclaration de la variable représentant la lecture au clavier
		Scanner lectureClavier = new Scanner(System.in) ;
		
		// Afficher le message "Valeur de la longueur : " à  l'écran
		System.out.print("Valeur de la longueur: ") ;

		// Lire au clavier une valeur
		longueur = lectureClavier.nextDouble() ;

		//lectureClavier.useLocale(Locale.FRENCH);
		lectureClavier.useLocale(Locale.US);
		
		// Afficher le message "Valeur de la largeur : " à  l'écran
		System.out.print("Valeur de la largeur: ") ;

		// Lire au clavier une valeur
		largeur = lectureClavier.nextDouble() ;

		// fermer les ressources
		lectureClavier.close() ;

		// Calculer la surface du rectangle
		// placer cette valeur dans la variable correspondante
		surface = largeur * longueur ;

		// Afficher le résultat
		System.out.print("Le rectangle de longueur " + longueur + " et de largeur " + largeur + " a pour surface: " + surface) ;
	} // Fin de la fonction main()
}