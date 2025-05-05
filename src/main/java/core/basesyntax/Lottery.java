package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor().toString();
        return new Ball(number, color);
    }
}
