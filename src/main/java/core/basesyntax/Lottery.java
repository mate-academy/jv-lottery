package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int valueNumber = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(valueNumber) + 1;
        return new Ball(randomColor.name(), randomNumber);
    }
}
