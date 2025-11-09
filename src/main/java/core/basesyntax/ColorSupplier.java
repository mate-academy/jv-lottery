package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random random = new Random();

        Colors[] color = Colors.values();

        int randomindex = random.nextInt(color.length);

        Colors randomcolors = color[randomindex];

        return randomcolors;
    }
}
