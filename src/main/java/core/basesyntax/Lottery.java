package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier;
    private final Random random = new Random();
    private static final int MAX_NUMBER = 100;
    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(randomColor, randomNumber);
    }
}