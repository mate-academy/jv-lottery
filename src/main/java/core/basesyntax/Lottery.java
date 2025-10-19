package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_LOTTERY_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        // 1. Отримуємо випадковий колір
        Color randomColor = colorSupplier.getRandomColor();

        // 2. Генеруємо випадкове число від 1 до MAX_LOTTERY_NUMBER включно
        // nextInt(N) повертає від 0 до N-1. Додаємо 1, щоб отримати 1 до N.
        int randomNumber = random.nextInt(MAX_LOTTERY_NUMBER) + 1;

        // 3. Створюємо та повертаємо нову кульку
        return new Ball(randomColor, randomNumber);
    }
}
