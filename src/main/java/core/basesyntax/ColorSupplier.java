package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int length = colors.length;
        int random = new Random(). nextInt(length);
        return colors[random].toString();
    }
}
