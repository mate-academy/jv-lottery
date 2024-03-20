package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        final int limitNumbers = 101;
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(limitNumbers);
        return new Ball(color, number);
    }
}
