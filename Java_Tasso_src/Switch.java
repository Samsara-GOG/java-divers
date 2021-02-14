import java.util.Scanner;

public class Switch 
{
    public static void main(String args[])
    {
        String choix ;
        Scanner lectureClavier = new Scanner(System.in) ;
        System.out.println("Votre choix (oui/non) ? : ") ;
        choix = lectureClavier.nextLine() ;
        lectureClavier.close();
        
        switch (choix)
        {
            case "oui" :
                System.out.println("Vous avez saisi oui !") ;
                break ;
            case "non" :
                System.out.println("Vous avez saisi non !") ;
                break ;
            default :
                System.out.println("Vous avez saisi ni oui ni non !") ;
        }
    }
}
