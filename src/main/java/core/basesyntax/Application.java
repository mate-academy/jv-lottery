package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = 3; // Change this to the desired number of balls
        Ball[] balls = new Ball[numberOfBalls];

        for (int i = 0; i < numberOfBalls; i++) {
            balls[i] = Lottery.getRandomBall();
        }

        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println("Ball " + (i + 1) + ": " + balls[i]);
        }
    }
}
