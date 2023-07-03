package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball firstBall = new Ball();
        Ball secondBall = new Ball();
        Ball thirdBall = new Ball();
        Lottery lottery = new Lottery();
        Ball[] balls = {firstBall, secondBall, thirdBall};
        for (Ball ball : balls) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
