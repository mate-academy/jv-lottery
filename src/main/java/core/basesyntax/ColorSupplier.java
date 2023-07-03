package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Color[] colors = Color.values();
        int length = colors.length;
        int random = new Random(). nextInt(length);
        return colors[random].name();
    }
}
