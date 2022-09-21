package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static SetOfColors getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(SetOfColors.values().length);
        return SetOfColors.values()[index];
    }
}
