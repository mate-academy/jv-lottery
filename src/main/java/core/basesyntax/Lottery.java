package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        Colors color = supplier.getRandomColor();
        Ball ball = new Ball(color, number);
        return ball;
    }
}
