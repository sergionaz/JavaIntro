public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();

        int i = 1;
        while (isTurnOnLight && i <= 10) {
            printSOS();
            i++;
        }

    }

    public static void printSOS() {
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight() {
        /*
        if (isTurnOnLight) {
            isTurnOnLight = false;
        } else {
            isTurnOnLight = true;
        }
        */
        // Transformo lo anterior a ternario
        // variable = (operacionAEjecutarse)?valor:valor2;

        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }

}
