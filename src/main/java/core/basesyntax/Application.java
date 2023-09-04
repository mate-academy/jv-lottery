package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_OBJECTS = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER_OF_OBJECTS];
        Lottery lottery = new Lottery();

        for (int i = 0; i < NUMBER_OF_OBJECTS; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
