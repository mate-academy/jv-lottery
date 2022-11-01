package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALL = 4;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[NUMBER_OF_BALL];
        for (int i = 0; i < balls.length; i++) {
            System.out.println(lottery.getRandomBall());
        }

    }
}
