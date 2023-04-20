package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Colors[] color = Colors.values();
        Random random = new Random();
        Colors randomColor = color[random.nextInt(color.length)];
        return randomColor;

    }
}
