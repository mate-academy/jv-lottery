package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(100) + 1;
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}

