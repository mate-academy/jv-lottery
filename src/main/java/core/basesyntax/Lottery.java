package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor.toString(), getRandomNumber());
    }

    public int getRandomNumber() {
        return new Random().nextInt(100) + 1;
    }
}
