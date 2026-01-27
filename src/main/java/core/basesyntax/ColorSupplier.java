package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Ball.Color[] allColors;
        allColors = Ball.Color.values();

        // 2. Генеруємо випадковий індекс від 0 до довжини масиву
        int randomIndex = new Random().nextInt(allColors.length);

        // 3. Вибираємо колір за цим індексом і повертаємо його назву (String)
        return allColors[randomIndex].name();

    }
}
