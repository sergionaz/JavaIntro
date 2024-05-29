public class DataTypes {
    public static void main(String[] args) {

        // Integer se soporte hasta 10 dígitos
        int n = 1234567890;

        // Enteros (byte {1 byte}, short {2 byte}, int {4 byte}, long {8 byte})
        long nL = 12345678901L;

        // Decimales (float {4 bytes} y double {8 bytes})
        double nD = 123.456;
        float nF = 123.456F;

        // Texto (char (1 sólo dígito)) {2 bytes}

        // Lógicos (boolean {2 bytes})

        // A partir de Java 10, puedo ignorar el keyword del tipo de dato delante de la variable
        var salary = 1000; // infiere que es int
        // pensión 3%
        var pension = salary * 0.03; // infiere que es double
        System.out.println(salary);
        System.out.println(pension);

        var totalSalary = salary - pension;
        System.out.println(totalSalary);

        var employeeName = "Sergio Nazar";
        System.out.println("Employee es: " + employeeName + " Salary: " + totalSalary );
    }
}