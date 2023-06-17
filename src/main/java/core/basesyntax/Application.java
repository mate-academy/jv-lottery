package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(random, colorSupplier);
        Ball [] balls = {lottery.getRandomBall(), lottery.getRandomBall(), lottery.getRandomBall()};
        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
