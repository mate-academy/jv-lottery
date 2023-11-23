package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public enum Color {
        RED,
        BLUE,
        GREEN,
        ORANGE;
    }

    public String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }
}
