import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;

        do {
            System.out.println("Seleccion el número de la opción deseada");
            System.out.println("1 Películas");
            System.out.println("2 Series");
            System.out.println("0 Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Películas ...");
                    break;
                case 2:
                    System.out.println("Series ...");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");

            }
        } while (response != 0);

    }
}
