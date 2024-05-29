public class NamingJava {
    public static void main(String[] args) {
        int celphone = 3377777;
        int celPhone = 5555223; // Este es mejor que el anterior
        System.out.println(celphone);
        System.out.println(celPhone);

        // También se puede hacer
        String $countryName = "Spain";
        String _backgroundColor = "Green";

        // También podría ser
        String currency$ = "MXN";
        String background_color = "Blue";

        // Constantes
        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        // Lower Camel Case
        String fullName = "Jorge Antonio Nazar";
        int sizeInCentimeters = 36;
    }
}