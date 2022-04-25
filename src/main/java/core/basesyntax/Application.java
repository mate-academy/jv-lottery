package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int numberOfBalls = 3;
        Ball[] balls = new Ball[numberOfBalls];
        for (int i = 0; i < balls.length; i++) {
            Lottery randomBall = new Lottery();
            balls[i] = randomBall.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
