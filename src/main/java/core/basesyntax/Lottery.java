package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        return new Ball(colorSupplier.getRandomColor(), randomNumber.nextInt(100));
    }
}
