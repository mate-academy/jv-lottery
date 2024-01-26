package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100) + 1;
        ColorSupplier newColor = new ColorSupplier();
        Ball randomBall = new Ball();
        randomBall.setColor(newColor.getRandomColor());
        randomBall.setNumber(value);
        return randomBall;
    }
}
