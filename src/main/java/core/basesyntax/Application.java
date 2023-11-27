package core.basesyntax;

public class Application {
    private static final Lottery lottery = new Lottery();
    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        for (int i = 1;i <= BALLS_NUMBER;i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
