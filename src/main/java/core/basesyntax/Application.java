package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball firstBall = Lottery.getRandomBall();
        Ball secondBall = Lottery.getRandomBall();
        Ball thirdBall = Lottery.getRandomBall();

        Ball[] balls = {firstBall, secondBall, thirdBall};

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
