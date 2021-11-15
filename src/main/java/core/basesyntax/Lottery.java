package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        int index = random.nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        Ball ball = new Ball(color, index);
        return ball;
    }
}
