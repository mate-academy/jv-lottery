package core.basesyntax;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Lottery ball1 = new Lottery(new ColorSupplier(new Random()), new Random());
        System.out.println(ball1.getRandomBall());
        Lottery ball2 = new Lottery(new ColorSupplier(new Random()), new Random());
        System.out.println(ball2.getRandomBall());
        Lottery ball3 = new Lottery(new ColorSupplier(new Random()), new Random());
        System.out.println(ball3.getRandomBall());
    }
}
