package core.basesyntax;

public class Main {
    private static final int NUMBER_BALLS = 3;

    public static void main(String[] args) {

        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[NUMBER_BALLS];
        for (int i = 0; i < balls.length; i++) {
            Ball ball = lottery.getRandomBall();
            balls[i] = ball;
            System.out.println(balls[i]);
        }
    }
}
