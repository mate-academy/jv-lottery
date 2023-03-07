package core.basesyntax;

public class Application {
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString(ball));
        }
    }
}
