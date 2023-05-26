package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
