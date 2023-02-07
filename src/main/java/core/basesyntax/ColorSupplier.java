package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        return Color.getValueByInt(new Random().nextInt(5)).toString();
    }
}
