package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        enum Colors {
            BLUE,
            WHITE,
            BLACK,
            YELLOW,
            RED
        }

        int index = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color.toString();
    }
}
