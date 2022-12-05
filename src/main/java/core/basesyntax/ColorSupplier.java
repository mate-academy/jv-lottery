package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(Color.values().length)].name();
    }
}
