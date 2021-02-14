import java.util.* ;

public class SecondDegre {
    public static void main(String args[]) {
        double a, b, c, delta;
        double x, x1, x2;
        Scanner lectureClavier = new Scanner(System.in);
        //lectureClavier.useLocale(Locale.FRENCH);
        lectureClavier.useLocale(Locale.US);
        System.out.print("Entrez une valeur pour a : ");
        a = lectureClavier.nextDouble();
        System.out.print("Entrez une valeur pour b : ");
        b = lectureClavier.nextDouble();
        System.out.print("Entrez une valeur pour c : ");
        c = lectureClavier.nextDouble();
        lectureClavier.close();

        System.out.println("Résolution de l'équation du second degre");
        System.out.println("a*x*x + b*x + c = 0");

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("tout réel est solution");
                }
                else {
                    System.out.println("il n'y a pas de solution");
                }
            }
            else {
                x = -c / b;
                System.out.println("La solution est " + x);
            }
        }
        else {
            delta = (Math.pow(b, 2) -4*a*c);
            System.out.println("Delta = " + delta);
            if (delta < 0) {
                System.out.println("il n'y a pas de solution dans les réels");
            }
            else {
                x1 = (-b + Math.sqrt(delta)) / (2*a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("il y a deux solutions égaled à" + x1 + " et " + x2);
            }
        }
    }
}