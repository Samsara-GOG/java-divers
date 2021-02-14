import java.util.* ;

public class OperationEntree {
    public static void main(String [] arg) {
        int X, Y;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Entrez une valeur pour X : ");
        X = lectureClavier.nextInt();
        System.out.println("Entrez une valeur pour Y : ");
        Y = lectureClavier.nextInt();
        System.out.println("Entrez une valeur pour X : ");
        X = lectureClavier.nextInt();
        lectureClavier.close();

        X = X + Y;
        System.out.print(" X = " + X);
        System.out.print("Y = " + Y);
    }
}
