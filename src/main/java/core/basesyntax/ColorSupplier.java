package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rnd = new Random();
        Color[] colors = Color.values();
        return (colors[rnd.nextInt(Color.values().length)].name());
    }
}
