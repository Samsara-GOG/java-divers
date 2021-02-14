// Calcul de racines carrées
// La classe Racines utilise la classe Clavier
public class Racines 
{   
    public static void main (String args[]) {
        final int NFOIS = 5 ;
        int i ;
        double x ;
        double racx ;
        System.out.println ("Bonjour") ;
        System.out.println ("Je vais vous calculer " + NFOIS + " racines carrées") ;
        for (i=0 ; i<NFOIS ; i++)
        {   System.out.print ("Donnez un nombre : ") ;
            x = Clavier.lireDouble() ;
            if (x < 0.0)
                System.out.println (x + " ne possède pas de racine carrée") ;
            else
            {   racx = Math.sqrt(x) ;
                System.out.println(x + " a pour racine carrée : " + racx) ;
            }    
        }
        System.out.println ("Travail terminé - Au revoir") ;
    }
}

