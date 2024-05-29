public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste light mode");
                break;
            case "Night":
                System.out.println("Seleccionaste nigth mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste blue dark mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste dark mode");
                break;
            default:
                System.out.println("Selecciona una opción correcta");
        }

    }
}
