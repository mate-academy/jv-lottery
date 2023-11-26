package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100) + 1; // 1 to 100
        return new Ball(randomColor, randomNumber);
    }
}
