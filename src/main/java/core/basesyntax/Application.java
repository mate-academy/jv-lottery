package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int ARRAY_SIZE = 3;
        Ball[] balls = new Ball[ARRAY_SIZE];
        Lottery lottery = new Lottery();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
