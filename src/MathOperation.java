public class MathOperation {
    public static void main(String[] args) {

        double x = 2.1;
        double y = 3;

        // Nos devuelve un número entero (redondea siempre para arriba)
        System.out.println(Math.ceil(x));

        // Nos devuelve un número entero (redondea siempre para abajo)
        System.out.println(Math.floor(x));

        // Nos devuelve un número elevado a otro número
        System.out.println(Math.pow(x, y));

        // Nos devuelve el número más grande
        System.out.println(Math.max(x, y));

        // Nos devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        // Área de un círculo (Pi * r2)
        System.out.println(Math.PI * Math.pow(y, 2));

        // Área de una esfera (4Pi * r2)
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Volúmen de una esfera (4/3 Pi * r3)
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));

    }
}
