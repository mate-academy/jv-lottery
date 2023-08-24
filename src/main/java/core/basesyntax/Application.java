package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALL = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER_OF_BALL];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = Lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
