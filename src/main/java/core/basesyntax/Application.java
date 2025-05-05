package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(colorSupplier, random);
        Ball first = lottery.getRandomBall();
        Ball second = lottery.getRandomBall();
        Ball third = lottery.getRandomBall();
        Ball[] balls = {first, second, third};
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
