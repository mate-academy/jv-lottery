package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[getRandomNumberForColor()].toString();
    }

    public int getRandomNumberForColor() {
        return random.nextInt(Colors.values().length);
    }
}
