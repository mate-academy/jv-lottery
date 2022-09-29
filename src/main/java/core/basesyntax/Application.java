package core.basesyntax;

public class Application {
    private static final int FIGURE_COUNT = 3;

    public static void main(String[] args) {
        for (int i = 0; i < FIGURE_COUNT; i++) {
            Ball ball = new Lottery().getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
