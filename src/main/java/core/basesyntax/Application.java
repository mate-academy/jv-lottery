package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        int numberOfBalls = 3;
        Ball[] balls = new Ball[numberOfBalls];
        Lottery lottery = new Lottery();
        for (int i = 0; i < numberOfBalls; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
