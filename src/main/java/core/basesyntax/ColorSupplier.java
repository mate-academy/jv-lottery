package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(AllColors.values().length);
        return (AllColors.values()[index]).name();
    }
}
