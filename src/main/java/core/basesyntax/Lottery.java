package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String clr = colorSupplier.getRandomColor();
        int index = new Random().nextInt(100);
        return new Ball(clr, index);
    }
}
