public class IfStatement {
    public static void main(String[] args) {

        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // Send file
            fileSended++;
            System.out.println("Archivo enviado. Cantidad:" + fileSended);
        } else {
            System.out.println("Por favor enciende tu bluetooth para iniciar la transferencia");
        }

    }
}
