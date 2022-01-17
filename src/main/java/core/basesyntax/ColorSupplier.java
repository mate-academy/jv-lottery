package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] color = Color.values();
        Random generator = new Random();
        return String.valueOf(color[generator.nextInt(color.length)]);
    }
}
