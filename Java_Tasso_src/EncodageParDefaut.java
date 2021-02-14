public class EncodageParDefaut {
    public static void main(String [] args)
        throws java.io.IOException {
    String encodage = System.getProperty("file.encoding");
    System.out.println("Encodage par défaut : " + encodage);
    String proverbe = "Qui sème le vent, récolte la tempête ";
    String proverbeEncode = new String (proverbe.getBytes(),
    encodage);
    System.out.println(" proverbe : " + proverbeEncode );
    }
}
