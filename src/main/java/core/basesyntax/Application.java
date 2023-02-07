package core.basesyntax;

public class Application {
    public static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0;i < NUMBER_OF_BALLS; i++) {
            lottery.getRandomBall();
            System.out.println(lottery.getBall().toString());
        }
    }
}
