package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int ballsToCreate = 3;
        Lottery lottery = new Lottery();

        for (int i = 0; i <= ballsToCreate; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
