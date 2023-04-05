package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = new Random().nextInt(100);
        return new Ball(color, number);
    }
}
