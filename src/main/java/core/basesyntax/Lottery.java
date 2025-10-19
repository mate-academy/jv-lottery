package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_LOTTERY_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        // Інлайнінг виразу: створення та повернення нового об'єкта Ball без тимчасових змінних
        return new Ball(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_LOTTERY_NUMBER) + 1
        );
    }
}
