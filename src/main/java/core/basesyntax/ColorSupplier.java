package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    enum Color {
        BLUE, WHITE, BLACK, YELLOW, RED;

        public static Color getRandomColor() {
            return values()[new Random().nextInt(values().length)];
        }
    }
}


