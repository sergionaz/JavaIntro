import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */
        String[][] cities = new String[4][2]; // 4 * 2 = 8 (valores)

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        // Bucle for
        System.out.println("-- Bucle for --");
        for (int i = 0; i < androidVersions.length; i++) {
            if (androidVersions[i] != null) {
                System.out.println(androidVersions[i]);
            }
        }
        System.out.println("-- Bucle for each --");
        // Bucle for each
        for (String androidVersion : androidVersions) {
            if (androidVersion != null) {
                System.out.println(androidVersion);
            }
        }

        System.out.println("---------------");

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        // Bucle for
        System.out.println("-- Bucle for --");
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
        System.out.println("-- Bucle for each --");
        // Bucle for each
        for (String[] pair : cities ) {
            for (String name : pair ) {
                System.out.println(name);
            }
        }

        System.out.println("---------------");

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);
    }
}