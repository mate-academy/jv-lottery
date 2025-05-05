package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private ColorSupplier colorSupplier;
    private Random random = new Random();

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
