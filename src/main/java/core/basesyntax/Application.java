package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int numberOfGames = 3;
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());
        for (int i = 0; i < numberOfGames; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
