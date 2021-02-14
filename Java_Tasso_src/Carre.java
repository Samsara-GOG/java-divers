/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Introduction : Naissance d'un programme
#	Exercice : I.3
#	Fichier  : Carre.java
#	Class    : Carre
*/

import java.util.* ;

public class Carre
{
	public static void main(String [] argument)
	{
		// Déclaration des variables représentant le périmètre et le côté
		double perimetre, cote ;

		// Déclaration de la variable représentant la lecture au clavier
		Scanner lectureClavier = new Scanner(System.in) ;

		//lectureClavier.useLocale(Locale.FRENCH);
		lectureClavier.useLocale(Locale.US);

		// Afficher le message "Valeur du côté : " à  l'écran
		System.out.print("Valeur du côté: ") ;

		// Lire au clavier une valeur
		cote = lectureClavier.nextDouble() ;
		
		// fermer les ressources
		lectureClavier.close() ;

		// Calculer le périmètre du carré
		// placer cette valeur dans la variable correspondante
		perimetre = 4 * cote ;

		// Afficher le résultat
		System.out.print("Le carré de côté " + cote + " a pour périmètre: " + perimetre) ;

	} // Fin de la fonction main()
}