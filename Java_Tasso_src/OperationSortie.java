public class OperationSortie {
    public static void main(String [] Arg) {
        int i = 223, j = 135;
        float a = 335.5f, b = 20.5f;
        char R = 'R', T = 'T';
        System.out.println("Vous avez entré : " + i);
        System.out.println("Pour un montant de " + a + " le total vaut : " + i + j);
        System.out.print("Après réduction de " + b + " %, vous gagnez : ");
        System.out.println((a * b) / 100 + " euros");
        System.out.println("La variable R = " + R + " et T = " + T);

        double x = 4, y = 2;
        System.out.println("x = " + x + " et y = " + y);
        System.out.println("Racine carrée de " + x + " = " + y);
        System.out.println("Racine carrée de " + x + " = " + Math.sqrt(x));
        System.out.println(x + " a la puissance " + y + " = " + (Math.pow(x, y)));

        double x2 = 9, y2 = 3;
        System.out.println("x = " + x2 + " et y = " + y2);
        System.out.println("Racine carrée de " + x2 + " = " + y2);
        System.out.println("Racine carrée de " + x2 + " = " + Math.sqrt(x2));
        System.out.println(x2 + " a la puissance " + y2 + " = " + (Math.pow(x2, y2)));
    }
}
