package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random(); // Створюємо один раз як поле

    public Color getRandomColor() {
        Color[] colors = Color.values();
        // Повертаємо одразу одним рядком без зайвих змінних
        return colors[random.nextInt(colors.length)];
    }
}
