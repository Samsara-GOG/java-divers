import java.util.* ;

public class Menu {
    public static void main(String [] arg) {
        int choice;
        int numberCount;

        // Affichage du menu en mode texte
        System.out.println("  1. Créer un compte");
        System.out.println("  2. Afficher un compte");
        System.out.println("3. Créer une ligne comptable");
        System.out.println("4. Sortir");
        System.out.println("5. De l'aide");
        System.out.println("Votre choix (1-5) : ");
        Scanner lectureClavier = new Scanner(System.in);
        choice = lectureClavier.nextInt();

        // Affichage de l'option 1 du Menu Principal
        // 1. Créer un compte
        System.out.println("\nType du compte [Types possibles : courant, joint, épargne] : ");
        System.out.println("Numéro du compte  : ");
        System.out.println("Première valeur créditée : ");
        System.out.println("Taux de placement : ");

        // Affichage de l'option 2 du Menu Principal
        // 2. Afficher un compte
        System.out.println("\nPour consulter votre compte bancaire, veuillez entrer votre numéro de compte : ");
        numberCount = lectureClavier.nextInt();

        // Affichage de l'option 3 du Menu Principal
        // 3. Créer une ligne comptable
        System.out.println("\noption non-programmée ");

        // Affichage de l'option 4 du Menu Principal
        // termine l'exécution du programme
        // 4. Sortir
        // System.exit(0);

        // Affichage de l'option 5 du Menu Principal
        // 5. De l'aide
        // Explication pour chaque option du menu principal

        lectureClavier.close();
;    }
}
