package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(100);
        Color randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor.toString(), randomNumber);
    }
}
