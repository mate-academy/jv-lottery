package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random ballColor = new Random();

    public Colors getRandomColor() {
        int index = ballColor.nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
