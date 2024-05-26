package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = new Random().nextInt(colors.length);
        String randomColor = String.valueOf(colors[index]);
        return randomColor;
    }
}
