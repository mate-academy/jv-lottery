package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random randomizer = new Random();
        int maxNumber = 100;
        return new Ball(ColorSupplier.getRandomColor(),randomizer.nextInt(maxNumber));
    }
}
