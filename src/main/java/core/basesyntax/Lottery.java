package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random = new Random();
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 100;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = MIN_NUMBER + new Random().nextInt(MAX_NUMBER - MIN_NUMBER + 1);
        return new Ball(randomColor, randomNumber);
    }
}
