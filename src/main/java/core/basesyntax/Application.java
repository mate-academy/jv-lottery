package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball = new Ball();
        for (int i = 0; i < ball.randomBalls; i++) {
            ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
