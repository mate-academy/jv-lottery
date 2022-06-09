package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = Lottery.getRandom().nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
