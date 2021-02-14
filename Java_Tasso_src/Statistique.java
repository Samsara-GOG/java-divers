import java.util.* ;

public class Statistique {
    public static void main (String [] args) {
        int nbCB = 0, nbCheque = 0, nbVirement = 0, nbDebit = 0 ;
        float prctCB, prctCheque, prctVirement;
        Scanner lectureClavier = new Scanner(System.in) ;
        //lectureClavier.useLocale(Locale.FRENCH);
		lectureClavier.useLocale(Locale.US);

        System.out.print("Nombre de paiements par Carte Bleue : ") ;
        nbCB = lectureClavier.nextInt() ;
        System.out.print("Nombre de chèques émis : ") ;
        nbCheque = lectureClavier.nextInt() ;
        System.out.print("Nombre de virements automatiques : ") ;
        nbVirement = lectureClavier.nextInt() ;
        lectureClavier.close() ;   
        
        nbDebit = nbCB + nbCheque + nbVirement ;

        prctCB = (float) nbCB / nbDebit * 100 ;
        prctCheque = (float) nbCheque / nbDebit  * 100 ;
        prctVirement = (float) nbVirement / nbDebit * 100 ;

        String newLine = System.getProperty("line.separator");

        System.out.println("Vous avez émis " + nbDebit + " ordres de débit"
         +newLine+ "dont " + (Math.round(prctCB*100)/100.0d) + " % par Carte Bleue"
         +newLine+ "     "
         + (Math.round(prctCheque*100)/100.0d) + " % par chèque" +newLine+ "     " + 
         (Math.round(prctVirement*100)/100.0d) + " % par virement") ;
        }   
 }
