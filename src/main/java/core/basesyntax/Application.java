package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = {Lottery.getRandomBall(), Lottery.getRandomBall(), Lottery.getRandomBall()};
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
