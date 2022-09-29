package core.basesyntax;

import java.util.Random;

public class Application {
    public static final int QUANTITY_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());
        for (int i = 0; i < QUANTITY_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
