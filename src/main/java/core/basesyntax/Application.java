package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery funLottery = new Lottery();
        Ball ball1 = funLottery.getRandomBall();
        Ball ball2 = funLottery.getRandomBall();
        Ball ball3 = funLottery.getRandomBall();
        Ball[] balls = {ball1, ball2, ball3};
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
