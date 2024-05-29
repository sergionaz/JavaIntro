public class Casting {
    public static void main(String[] args) {

        // En un año ubiqué 30 perritos
        // ¿Cuántos perritos ubiqué al mes?

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        // Acá me interesa es la estimación
        int estimatedMonthlyDogs = (int) monthlyDogs; // Esto trunca la parte decimal
        System.out.println(estimatedMonthlyDogs);

        // Por exactitud, sería
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        // Implícitos o Automáticos
        double c = a / b;
        System.out.println(c); // Automáticamente lo castea, pero no me muestra la precisión

        // Char cabe en int, pero no es short. Tengo que castear
        char n = '1';
        int nI = n;
        System.out.println(nI);
        short nS = (short) n;
        System.out.println(nS);
    }
}
