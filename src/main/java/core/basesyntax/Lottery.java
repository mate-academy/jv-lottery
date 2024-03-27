package core.basesyntax;

import java.util.Random;

public class Lottery {
    protected ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier.Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor.toString(), randomNumber);
    }
}
