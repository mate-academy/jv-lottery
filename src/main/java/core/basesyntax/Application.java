package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int numberOfBalls = 3;
        Ball[] balls = new Ball[numberOfBalls];
        Lottery lottery = new Lottery();
        for (int i = 0; i < numberOfBalls; i++) {
            balls[i] = lottery.getRandomBall();
        }

        for (Ball ball :
                balls) {
            System.out.println("Ball color=" + ball.getColor() + " and number=" + ball.getNumber());
        }
    }
}
