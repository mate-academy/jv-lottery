package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {
        Colors[] color = Colors.values();
        int index = new Random().nextInt(color.length);
        return color[index].toString();
    }
}
