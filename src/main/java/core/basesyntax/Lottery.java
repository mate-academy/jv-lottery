package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNum = new Random().nextInt(100);
        return new Ball(colorSupplier.getRandomColor(),randomNum);
    }
}
