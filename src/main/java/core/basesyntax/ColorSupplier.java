package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random randomColors = new Random();
        int index = randomColors.nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
