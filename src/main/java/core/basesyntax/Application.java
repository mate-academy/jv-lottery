package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int ballsCount = 3;
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[ballsCount];
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
