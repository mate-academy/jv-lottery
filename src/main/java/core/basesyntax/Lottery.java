package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int Max_Ball_Number = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomGenerator = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = randomGenerator.nextInt(Max_Ball_Number) + 1;
        return new Ball(color, number);
    }
}
