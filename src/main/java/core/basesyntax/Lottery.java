package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random number = new Random();
        int value = number.nextInt(100);
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(), value);
    }
}
