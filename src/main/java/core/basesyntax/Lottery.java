package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(), randomNumber);
        return ball;
    }
}
