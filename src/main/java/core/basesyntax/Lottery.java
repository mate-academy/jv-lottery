package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100; // Константа замість магічного числа
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        // Створюємо і повертаємо Ball в один рядок
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER + 1));
    }
}
