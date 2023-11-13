package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final int maxNumber = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        Random random = new Random();
        String randoColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxNumber) + 1;
        return new Ball(randoColor, randomNumber);
    }
}
