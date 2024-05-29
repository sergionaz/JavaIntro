public class Funciones {
    public static void main(String[] args) {

        double y = 3;

        // Área de un círculo (Pi * r2)
        double area = circleArea(y);
        System.out.println(area);
        System.out.println(circleArea(y)); // simplificado en 1 línea

        // Área de una esfera (4Pi * r2)
        System.out.println(sphereArea(y));

        // Volúmen de una esfera (4/3 Pi * r3)
        System.out.println(sphereVolume(y));

        System.out.println("Pesos a dólares: " + convertToDollar(100, "MXN"));

    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de diner a dólares.
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Sólo acepta MXN y COP
     * @return quantity Devuelve la cantidad
     *
     * */
    public static double convertToDollar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }

        return quantity;
    }

}
