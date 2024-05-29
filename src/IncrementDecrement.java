public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        // Decremento (posfijo)
        lives--;
        System.out.println(lives);

        // Incremento (posfijo)
        lives ++;
        System.out.println(lives);

        // Gana un regalo por ganar una vida
        int gift = 100 + lives++; // postfijo
        System.out.println(gift);

        gift = 100 + ++lives; // prefijo
        System.out.println(gift);
    }
}
