package core.basesyntax;

public class Application {
    static final int randomBallsCount = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < Application.randomBallsCount; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
