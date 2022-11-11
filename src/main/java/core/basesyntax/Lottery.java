package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        String randomColor = supplier.getRandomColor();

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        return new Ball(randomColor, randomNumber);

    }
}
