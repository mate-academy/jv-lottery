package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = 3;
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[numberOfBalls];
        for (int i = 0; i < balls.length; i++) {
            Ball ball = lottery.getRandomBall();
            balls[i] = ball;
            System.out.println(ball);
        }
    }
}
