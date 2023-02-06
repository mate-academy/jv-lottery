package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int ballsQuantity = 3;
        Ball[] lotteryBalls = new Ball[ballsQuantity];
        for (int i = 0; i < ballsQuantity; i++) {
            lotteryBalls[i] = new Lottery().getRandomBall();
        }
        for (Ball ball: lotteryBalls) {
            System.out.println(ball.toString());
        }
    }
}
