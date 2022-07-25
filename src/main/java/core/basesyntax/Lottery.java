package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
