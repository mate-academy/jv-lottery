package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int ballNumber = new Random().nextInt(100);
        return new Ball(color, ballNumber);
    }
}
