package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return String.valueOf(Colors.values()[random.nextInt(Colors.values().length)]);
    }
}
