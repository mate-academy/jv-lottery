package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Color color = colorSupplier.getRandomColor();
        int ballNumber = random.nextInt(0, 101);
        return new Ball(color, ballNumber);
    }
}
