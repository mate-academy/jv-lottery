package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int numberOfBalls = 3;
        Ball[] balls = new Ball[numberOfBalls];
        Lottery randomBall = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = randomBall.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
