package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery randomBalls = new Lottery();

        Ball[] balls = new Ball[] {
                randomBalls.getRandomBall(),
                randomBalls.getRandomBall(),
                randomBalls.getRandomBall()
        };

        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }

    }
}
