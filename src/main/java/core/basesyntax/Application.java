package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        final int NUMBER_OF_GAMES = 3;
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
