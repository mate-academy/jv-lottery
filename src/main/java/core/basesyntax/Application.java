package core.basesyntax;

public class Application {
    private static final int NUMBERS_OF_BALL = 3;

    public static void main(String[] args) {
        Lottery[] balls = new Lottery[NUMBERS_OF_BALL];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery();
            System.out.println(balls[i].getRandomBall());
        }

    }
}
