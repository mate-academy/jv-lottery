package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(), randomNumber);
        return ball;
    }
}
