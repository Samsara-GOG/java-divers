import java.util.*;

public class Achat {
    public static void main(String [] arg) {
        String pdt;
        Double prix;
        int quantite;
        Scanner lectureClavier = new Scanner(System.in);
        //lectureClavier.useLocale(Locale.FRENCH);
        lectureClavier.useLocale(Locale.US);

        System.out.print("Entrez le nom du produit : ");
        pdt = lectureClavier.next();

        System.out.print("Entrez le prix du produit : ");
        prix = lectureClavier.nextDouble();

        System.out.print("Entrez la quantité achetée : ");
        quantite = lectureClavier.nextInt();
        lectureClavier.close();
        
        System.out.print("Vous avez acheté : " + quantite + " " + pdt);
        System.out.println(" au prix unitaire de " + (quantite * prix) + " euros");
    }
}
