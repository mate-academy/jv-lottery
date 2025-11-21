package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        final int count = 3;

        Random rnd = new Random();
        ColorSupplier supplier = new ColorSupplier(rnd);
        Lottery lottery = new Lottery(rnd, supplier);

        for (int i = 0; i < count; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
