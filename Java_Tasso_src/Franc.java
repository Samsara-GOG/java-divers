import java.util.* ;

public class Franc {
    public static void main(String [] Arg) {
        
        double francs, euros = 0.0;
        double rate = 6.55957;
        Scanner lectureClavier = new Scanner(System.in);
        //lectureClavier.useLocale(Locale.FRENCH);
        lectureClavier.useLocale(Locale.US);
        System.out.print("\nSaisir le nombre d'euros à convertir : ");
        euros = lectureClavier.nextDouble() ;
        lectureClavier.close();
        francs = euros * rate;
        System.out.println("\nNombre de francs : " + euros);
        System.out.println("Conversion E/F : * " + rate);
        System.out.println("Nombre d'euros : " + (Math.round(francs*100)/100.0d) + "\n") ;
    }
}
