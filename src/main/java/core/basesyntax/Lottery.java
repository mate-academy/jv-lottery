package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        int index = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(),index);
        return ball;
    }
}
