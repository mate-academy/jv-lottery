package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = supplier.getRandomColor();
        Ball ball = new Ball(randomColor, random.nextInt(100));
        return ball;
    }
}

