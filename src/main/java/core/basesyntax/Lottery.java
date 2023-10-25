package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        int maxNumber = 100;
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxNumber);

        return new Ball(randomColor, randomNumber);
    }
}
