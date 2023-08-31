package core.basesyntax;

public class Application {
    private static final int numOfObjects = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[numOfObjects];
        Lottery lottery = new Lottery();

        for (int i = 0; i < numOfObjects; i++) {
            balls[i] = new Ball();
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
