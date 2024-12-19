package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Lottery {
    public static String getRandomColor() {
        Colors[] colors = Colors.values();
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex].toString();
    }
}
