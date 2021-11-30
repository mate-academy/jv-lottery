package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = random.nextInt(100);
        DifColors difColors = colorSupplier.getRandomColor();
        return ball;
    }
}

