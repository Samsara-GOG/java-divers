import java.util.*;

public class Euro 
{
    public static void main(String [] Arg)
    {
        double francs, euros;
        double rate = 6.55957;
        Scanner lectureClavier = new Scanner(System.in);
        //lectureClavier.useLocale(Locale.FRENCH);
        lectureClavier.useLocale(Locale.US);
        System.out.print("\nSaisir le nombre de francs à convertir : ") ;
        francs = lectureClavier.nextDouble() ;
        lectureClavier.close();
        euros = francs / rate;
        System.out.println("\nNombre de francs : " + francs);
        System.out.println("Conversion F/E : /" + rate);
        System.out.println("Nombre d'euros : " + (Math.round(euros*100)/100.0d) + "\n") ;
    }
}
