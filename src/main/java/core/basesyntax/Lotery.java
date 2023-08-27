package core.basesyntax;

import java.util.Random;

public class Lotery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = new Random().nextInt(101);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
