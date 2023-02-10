package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    static Random randomColor = new Random();
    static int index;

    public Colors getRandomColor() {
        index = randomColor.nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
