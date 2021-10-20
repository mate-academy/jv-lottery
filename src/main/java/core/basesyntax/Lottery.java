package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        int randNumber = new Random().nextInt(100);
        Ball ball = new Ball(color, randNumber);
        return ball;
    }
}
