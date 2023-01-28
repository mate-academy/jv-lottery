package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
