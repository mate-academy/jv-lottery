package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        final int QUANTITY = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < QUANTITY; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
        // create three balls using class Lottery and print information about them in console
    }
}
