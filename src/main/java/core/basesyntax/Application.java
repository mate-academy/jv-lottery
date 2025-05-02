package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int numberOfBalls = 3;
        Lottery lottery = new Lottery();
        Ball[] ball = new Ball[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            ball[i] = lottery.getRandomBall();
            System.out.println(ball[i]);
        }
    }
}
