package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public static Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
