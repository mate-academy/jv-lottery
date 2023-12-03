package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] ballsArray = {new Lottery().getRandomBall(),
                new Lottery().getRandomBall(),
                new Lottery().getRandomBall()};

        for (Ball ball : ballsArray) {
            System.out.println(ball);
        }
    }
}
