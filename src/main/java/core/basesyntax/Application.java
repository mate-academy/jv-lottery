package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Lottery lottery = new Lottery(colorSupplier, random);

        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
