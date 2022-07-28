package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random value = new Random();
        final int NUM = value.nextInt(100);
        return new Ball(color.getRandomColor().toString(), NUM);
    }
}
