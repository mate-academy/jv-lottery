package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        Color randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor.name(), randomNumber);
    }
}
