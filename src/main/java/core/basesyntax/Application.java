package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int numberOfBalls = 3;

        Ball[] balls = new Ball[numberOfBalls];

        for (int i = 0; i < numberOfBalls; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
