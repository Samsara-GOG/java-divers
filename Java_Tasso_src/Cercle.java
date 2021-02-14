import java.util.* ;

public class Cercle 
{
	public static void main(String [] arg)
    {
		// 1. Déclarer les variables
		double unRayon, lePerimetre, laSurface ;

		// Valeur numérique en entrée
		Scanner lectureClavier = new Scanner(System.in) ;

		//lectureClavier.useLocale(Locale.FRENCH);
		lectureClavier.useLocale(Locale.US);

		// 2.a Afficher le message "Valeur du rayon : " à l'écran
		System.out.print("Valeur du rayon: ") ;

		// 2.b Lire au clavier une valeur, placer cette valeur dans la variable unRayon
		unRayon = lectureClavier.nextDouble() ;

		// fermer les ressources
		lectureClavier.close() ;

		// 3. Calculer la circonférence en utilisant la formule consacrée
		lePerimetre = 2 * Math.PI * unRayon ;
		
		// 3.5 Calculer la surface en utilisant la formuule consacrée
		laSurface = Math.PI*unRayon*unRayon ;

		// 4. Afficher le résultat 
		System.out.print("Le cercle de rayon " + unRayon +
						 " a pour périmètre " + lePerimetre + ",\net pour surface " + 
						 laSurface + ".");
	} // Fin de la fonction main()
}