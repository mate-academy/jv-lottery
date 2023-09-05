package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {

    public static Colors getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
