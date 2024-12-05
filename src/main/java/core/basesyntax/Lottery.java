package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();

        String randomColor = colorSupplier.getRandomColor();

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        return new Ball(randomColor, randomNumber);
    }
}

