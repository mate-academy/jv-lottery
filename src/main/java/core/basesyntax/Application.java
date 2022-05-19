package core.basesyntax;

public class Application {
    private final static int BALLS_LIMIT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALLS_LIMIT; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}