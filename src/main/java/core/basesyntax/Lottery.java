package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int randomNum = new Random().nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(),randomNum);
    }
}
