package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        int index;
        String color;

        color = supplier.getRandomColor();
        index = new Random().nextInt(100);

        Ball ball = new Ball(color, index);
        return ball;
    }
}
