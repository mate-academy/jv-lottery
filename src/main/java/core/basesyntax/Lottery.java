package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random randomNumberBall = new Random();
        int randomBall = randomNumberBall.nextInt(100) + 1;
        ColorSupplier randomColorBall = new ColorSupplier();
        return randomBall + " " + randomColorBall.getRandomColor();

    }
}
