package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    public static Colors getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)];
    }
}
