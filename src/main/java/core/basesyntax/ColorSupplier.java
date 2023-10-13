package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final int index = random.nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[index].toString();
    }
}
