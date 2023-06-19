package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery randomBall = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println("Your ball have "
                    + randomBall.getRandomBall().getColor() + " color and number "
                    + randomBall.getRandomBall().getNumber());
        }
    }
}
