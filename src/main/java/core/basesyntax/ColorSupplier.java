package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random rnd = new Random();
    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[rnd.nextInt(Color.values().length)].name();
    }
}
