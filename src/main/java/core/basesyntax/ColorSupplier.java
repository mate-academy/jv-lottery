package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = new String[Color.values().length];

    public String getRandomColor() {
        for (int i = 0; i < Color.values().length; i++) {
            colors[i] = Color.values()[i].toString();
        }
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
