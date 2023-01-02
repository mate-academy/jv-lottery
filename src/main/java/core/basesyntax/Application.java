package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(new ColorSupplier(), new Random());
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}