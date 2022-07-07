package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
    int ballNumber = new Random().nextInt(100);
    ColorSupplier colorSupplier = new ColorSupplier();
    String ballColor = String.valueOf(colorSupplier.getRandomColor());
        return new Ball(ballColor, ballNumber);
    }
}
