package core.basesyntax;

public class Application {
    private static final int BALLS_COUNT = 3;

    public Application() {
    }

    public static void main(String[] args) {
        Ball[] balls = new Ball[BALLS_COUNT];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; ++i) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }

    }
}
