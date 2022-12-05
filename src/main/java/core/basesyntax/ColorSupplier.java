package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random randomColor = new Random();
    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[randomColor.nextInt(Color.values().length)].name();
    }
}
