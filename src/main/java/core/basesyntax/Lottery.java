package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;

    public static Ball getRandomBall() {
        return new Ball(new Random().nextInt(MAX_NUMBER) + 1, getRandomColor());
    }
}
