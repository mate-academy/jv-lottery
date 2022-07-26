package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final Random random = new Random();
    static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(100);
        String color = colorSupplier.getRandomColor(random);
        return new Ball(number, color);
    }
}
