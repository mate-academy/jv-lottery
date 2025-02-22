package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        int number = new Random().nextInt(101);
        return new Ball(color, number);
    }
}
