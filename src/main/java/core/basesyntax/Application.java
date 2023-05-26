package core.basesyntax;

public class Application {
    private static final int BALLS_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball [] balls = new Ball[BALLS_COUNT];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
