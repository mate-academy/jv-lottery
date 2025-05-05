package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] color = Color.values();
        return color[random.nextInt(color.length)].name();
    }
}
