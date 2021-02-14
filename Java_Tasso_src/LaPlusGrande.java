import java.util.* ;

public class LaPlusGrande {
    public static void main(String [] arg) {
        double premiere, deuxieme, laPlusGrande;
        
        // Scanner lectureClavier = new Scanner(System.in);
        //lectureClavier.useLocale(Locale.FRENCH);
        lectureClavier.useLocale(Locale.US);
        System.out.println("Veuillez entrer le premier nombre : ");
        premiere = lectureClavier.nextDouble();
        System.out.println("Veuillez entrer le deuxieme nombre : ");
        deuxieme = lectureClavier.nextDouble();
        System.out.println("Vous avez entré ces valeurs : " + premiere + " et " + deuxieme);
        lectureClavier.close();

        if (premiere == deuxieme) {
            System.out.println(deuxieme + " = " + premiere + " " + (deuxieme == premiere));
            System.out.println("Les valeurs sont toutes deux égales");
        } else if (premiere > deuxieme) {
            laPlusGrande = premiere;
            System.out.println(deuxieme + " < " + premiere + " " + (deuxieme < premiere));
            System.out.println("La plus grande des valeurs est donc la première entrée : " + laPlusGrande);
        } else {
            laPlusGrande = deuxieme;
            System.out.println(premiere + " < " + deuxieme + " " + (premiere < deuxieme));
            System.out.println("La plus grande des valeurs est donc la deuxième entrée : " + laPlusGrande);
        }
        
    }
}
