package core.basesyntax;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        final Lottery ball1 = new Lottery(new ColorSupplier(new Random()), new Random());
        System.out.println(ball1.getRandomBall());
        final Lottery ball2 = new Lottery(new ColorSupplier(new Random()), new Random());
        System.out.println(ball2.getRandomBall());
        final Lottery ball3 = new Lottery(new ColorSupplier(new Random()), new Random());
        System.out.println(ball3.getRandomBall());
    }
}
