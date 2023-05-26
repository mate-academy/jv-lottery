package core.basesyntax;

public class Application {
    static final int COUNT_BALLS = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        final Ball[] magicBalls = new Ball[COUNT_BALLS];
        for (int i = 0; i < magicBalls.length; i++) {
            magicBalls[i] = lottery.getRandomBall();
            System.out.println(magicBalls[i]);
        }
    }
}
