package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Colors {
        BLUE, YELLOW, GREEN, BLACK, PURPLE;

        public static Colors getRandomColor() {
            Colors[] colors = Colors.values();
            Random random = new Random();
            return colors[random.nextInt(colors.length)];
        }
    }
}
