package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int maxRandomNumber = 100;
        int randomNumber = new Random().nextInt(maxRandomNumber);
        Colors color = new ColorSupplier().getRandomColor();

        return new Ball(color, randomNumber);
    }
}
