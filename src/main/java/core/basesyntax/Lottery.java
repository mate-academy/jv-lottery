package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = getRandomNumber();
        return new Ball(color, number);
    }

    private int getRandomNumber() {
        return random.nextInt(101);
    }
}
