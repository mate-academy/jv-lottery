package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxRandom = 100;
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = new Random();
    }

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxRandom) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
