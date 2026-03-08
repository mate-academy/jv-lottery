package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        int bound = colors.length;
        int index = new Random().nextInt(bound);

        return colors[index].name();
    }
}
