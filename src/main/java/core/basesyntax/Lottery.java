package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int number = new Random().nextInt(100);
        Colors color = ColorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
