package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(new ColorSupplier(), new Random(), 100);
        int numberOfBalls = 3;
        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
