public class DaysPerMonth 
{
    public static void main(String args[])
    {
        byte months = 0, days = 0 ;
        short year ;
        Clavier lectureClavier = new Clavier() ;
        System.out.print("Veuillez entrer le numéro du mois : ") ;
        months = lectureClavier.lireByte() ;
        System.out.print("Veuillez entrer l'année : ") ;
        year = lectureClavier.lireShort() ;

        switch (months)
        {
            case 1 : case 3 :       // Pour les mois à 31 jours
            case 5 : case 7 :
            case 8 : case 10 :
            case 12 :
                days = 31 ;
                break ;
            case 4 : case 6 :       // Pour les mois à 30 jours
            case 9 : case 11 :
                days = 30 ;
                break;
            case 2 :              // Pour le cas particulier du mois de février
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    days = 29 ;
                } else {
                    days = 28 ;
                }
                break ;
            default :  // En cas d'erreur de frappe
                System.out.println("Impossible, ce mois n'existe pas ") ;
                System.exit(0) ;
        }
        System.out.print("En " + year + ", le mois numero " + (months)) ;
        System.out.println(" a " + days + " jours ") ;
    }
}


