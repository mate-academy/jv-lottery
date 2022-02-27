package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        String color = colors[random.nextInt(colors.length)].toString();
        return color;
    }
}