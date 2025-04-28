package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int lengthColors = Colors.values().length;

    public Colors getRandomColor() {
        int randomColorIndex = random.nextInt(lengthColors);

        return Colors.values()[randomColorIndex];
    }

}
