package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        int colorIndex = random.nextInt(Colors.values().length - 1);
        return Colors.values()[colorIndex].name();
    }
}
