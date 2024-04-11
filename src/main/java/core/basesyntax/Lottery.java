package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        int maxNumber = 100;
        int minNumber = 1;
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        return new Ball(randomColor.name(), randomNumber);
    }
}
