package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball firstBall = Lottery.getRandomBall();
        firstBall.getBallInfo();

        Ball secondBall = Lottery.getRandomBall();
        secondBall.getBallInfo();

        Ball thirdBall = Lottery.getRandomBall();
        thirdBall.getBallInfo();
    }
}
