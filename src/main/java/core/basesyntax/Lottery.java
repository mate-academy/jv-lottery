package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER) + 1; // випадкове число від 1 до 100
        return new Ball(color, number);
    }
}
