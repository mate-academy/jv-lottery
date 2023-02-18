package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = {
                new Lottery().getRandomBall(),
                new Lottery().getRandomBall(),
                new Lottery().getRandomBall()
        };

        for (Ball ball: balls) {
            System.out.println(ball.toString());
        }
    }
}
