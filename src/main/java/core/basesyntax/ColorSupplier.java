package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {
        Random randomColor = new Random();
        return Colors.values()[randomColor.nextInt(Colors.values().length)];
    }
}
