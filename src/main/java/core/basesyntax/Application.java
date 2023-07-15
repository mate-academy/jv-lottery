package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] randomBalls = {Lottery.getRandomBall(),
                Lottery.getRandomBall(),
                Lottery.getRandomBall()};

        for (Ball ball: randomBalls) {
            System.out.println(ball.getColor());
            System.out.println(ball.getNumber());
        }
    }
}
