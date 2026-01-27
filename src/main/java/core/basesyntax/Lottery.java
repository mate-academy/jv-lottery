package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        // 1. Отримуємо випадковий колір через наш саплайєр
        String color = colorSupplier.getRandomColor();

        // 2. Генеруємо випадкове число до 100
        int number = random.nextInt(101);

        // 3. Створюємо і повертаємо новий об'єкт Ball з цими даними
        return new Ball(color, number);
    }
}
