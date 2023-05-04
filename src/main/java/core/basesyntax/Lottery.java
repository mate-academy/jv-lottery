package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final int maxNumber = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(maxNumber);
        //ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor().toString();
        return new Ball(color, number);
    }
}
