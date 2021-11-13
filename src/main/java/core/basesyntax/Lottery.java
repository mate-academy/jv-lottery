package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int index = new Random().nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        Ball ball = new Ball(color, index);
        return ball;
    }
}
