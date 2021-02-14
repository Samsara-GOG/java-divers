/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Introduction : Naissance d'un programme
#	Exercice : I.2
#	Fichier  : Premier.java
#	Class    : Premier
*/
import java.util.* ;

public class Premier {
    public static void main(String [] argument) {
    double a;
    Scanner lectureClavier = new Scanner(System.in) ;
    //lectureClavier.useLocale(Locale.FRENCH);
    lectureClavier.useLocale(Locale.US);
    
    System.out.print("Entrez une valeur: ") ;
    a = lectureClavier.nextDouble();
    // fermer les ressources
    lectureClavier.close() ;
    System.out.print("Vous avez entré: " + a) ;
    } // Fin de la fonction main()
}