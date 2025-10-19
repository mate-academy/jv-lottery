package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        // Отримуємо масив усіх значень перерахування Color
        Color[] colors = Color.values();

        // Генеруємо випадковий індекс у межах довжини масиву
        int randomIndex = random.nextInt(colors.length);

        // Повертаємо колір за цим індексом
        return colors[randomIndex];
    }
}
