package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Colors[] colorsArray = Colors.values();
        int randomIndex = new Random().nextInt(colorsArray.length);
        return String.valueOf(colorsArray[randomIndex]);
    }
}
