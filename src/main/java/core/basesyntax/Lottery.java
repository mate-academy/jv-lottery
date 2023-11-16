package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int maxNumber = Ball.getMaxNumber();
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = random.nextInt(maxNumber);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
