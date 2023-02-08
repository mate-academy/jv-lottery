package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(7)].name();
    }
}
