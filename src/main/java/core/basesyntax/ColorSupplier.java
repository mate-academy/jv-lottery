package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Color[] colorList = Color.values();
        return Color.valueOf(colorList[new Random().nextInt(colorList.length)].name());
    }
}
