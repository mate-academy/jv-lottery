package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        Color randomColor = supplier.getRandomColor();
        Ball ball = new Ball(randomColor, random.nextInt(100));
        return ball;
    }
}

