package core.basesyntax;

public class Application {
    /**
     * Commented block represents task solution with the help of arrays
     * The second block is solution without arrays
     */
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console

        /*
        * String[] balls = {
        *         "First ball", "Second ball", "Third ball"
        * };
        * Lottery lot = new Lottery();
        * for (String ball : balls) {
        *     System.out.println(ball + " color: " + lot.getRandomBall().color);
        *     System.out.println(ball + " number: " + lot.getRandomBall().number);
        *     System.out.println();
        * }
        */

        Lottery lot = new Lottery();
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". color: " + lot.getRandomBall().color);
            System.out.println(i + ". number: " + lot.getRandomBall().number);
            System.out.println();
        }
    }
}
