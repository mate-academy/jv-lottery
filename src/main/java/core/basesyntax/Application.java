package core.basesyntax;

public class Application {
    private static final int FIGURE_COUNT = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[FIGURE_COUNT];
        Lottery lottery = new Lottery();
        for (int i = 0; i < FIGURE_COUNT; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
