package core.basesyntax;

public class Application {
    private static final int numOfObjects = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[numOfObjects];
        Lottery lottery = new Lottery();

        for (int i = 0; i < numOfObjects; i++) {
            balls[i] = new Ball();
            lottery.getRandomBall(balls[i]);
            System.out.println(balls[i]);
        }
    }
}
