package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int value = new Random().nextInt(100);
        Color color = ColorSupplier.getRandomColor();
        return new Ball(color, value);
    }
}
