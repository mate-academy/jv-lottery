package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random(100);
        int ballNumber = new Random().nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        Color ballColor = colorSupplier.getRandomColor();
        return new Ball(ballColor, ballNumber);
    }
}