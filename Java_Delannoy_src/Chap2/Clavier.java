// classe fournissant des fonctions de lecture au clavier
import java.io.* ;
public class Clavier 
{
    public static String lireString() // lecture d'une chaîne
    {   String ligne_lue = null ;
        try
        {   InputStreamReader lecteur = new InputStreamReader (System.in) ;
            BufferedReader entree = new BufferedReader(lecteur) ;
            ligne_lue = entree.readLine() ;
        }
        catch (IOException err)
        {   System.exit(0) ;
        }
        return ligne_lue ;
    }
    
    public static float lireFloat () // lecture d'un float
    {   float x=0 ; // valeur à lire
        try
        {   String ligne_lue = lireString() ;
            x = Float.parseFloat(ligne_lue) ;
        }
        catch (NumberFormatException err)
        {   System.out.println ("*** Erreur de données ***") ;
            System.exit(0) ;
        }
        return x ;
    }

    public static double lireDouble () // lecture d'un double
    {   double y=0 ; // valeur à lire
        try
        {   String ligne_lue = lireString() ;
            y = Double.parseDouble(ligne_lue) ; 
        }
        catch (NumberFormatException err)
        {   System.out.println("*** Erreur de donnée ***") ;
            System.exit(0) ;
        }
        return y ;
    }

    public static byte lireByte () // lecture d'un byte
    {   byte z=0 ; // valeur à lire
        try
        {   String ligne_lue = lireString() ;
            z = Byte.parseByte(ligne_lue) ;
        }
        catch (NumberFormatException err)
        {   System.out.println ("*** Erreur de donnée ***") ;
            System.exit(0);
        }
        return z ;
    }

    public static short lireShort () // lecture d'un byte
    {   short w=0 ; // valeur à lire
        try
        {   String ligne_lue = lireString() ;
            w = Short.parseShort(ligne_lue) ;
        }
        catch (NumberFormatException err)
        {   System.out.println ("*** Erreur de donnée ***") ;
            System.exit(0);
        }
        return w ;
    }

    public static int lireInt () // lecture d'un int
    {   int n=0 ; // valeur à lire
        try
        {   String ligne_lue = lireString() ;
            n = Integer.parseInt(ligne_lue) ;
        }
        catch (NumberFormatException err)
        {   System.out.println ("*** Erreur de donnée ***") ;
            System.exit(0) ;
        }
        return n ;
    }

    // programme de test de la classe clavier
    public static void main (String[] args)
    {   System.out.println("donnez une chaîne de caractères") ;
        String a ;
        a = Clavier.lireString() ;
        System.out.println ("merci pour " + a) ;

        System.out.println ("donnez un byte") ;
        byte z ;
        z = Clavier.lireByte() ;
        System.out.println ("merci pour " + z) ;

        System.out.println ("donnez un short") ;
        short w ;
        w = Clavier.lireShort() ;
        System.out.println ("merci pour " + w) ;

        System.out.println ("donnez un flottant") ;
        float x ;
        x = Clavier.lireFloat() ;
        System.out.println ("merci pour " + x) ;

        System.out.println ("donnez un double") ;
        double y ;
        y = Clavier.lireDouble() ;
        System.out.println ("merci pour " + y) ;
    
        System.out.println ("donnez un entier") ;
        int n ;
        n = Clavier.lireInt() ;
        System.out.println ("merci pour " + n) ;
    }
}
