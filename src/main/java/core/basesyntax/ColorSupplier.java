package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random;

    public static Color getRandomColor() {
        random = new Random();
        int index = random.nextInt(SetOfColors.values().length);
        return SetOfColors.values()[index];
    }
}
