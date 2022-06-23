package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball ballOne = lottery.getRandomBall();
        Ball ballTwo = lottery.getRandomBall();
        Ball ballThree = lottery.getRandomBall();

        Ball[] balls = new Ball[]{ballOne, ballTwo, ballThree};

        for (Ball ball : balls) {
            System.out.println(ball);
        }

    }
}
