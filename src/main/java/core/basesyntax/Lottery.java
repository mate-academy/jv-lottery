package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        return new Ball(color, randomNumber);
    }
}
