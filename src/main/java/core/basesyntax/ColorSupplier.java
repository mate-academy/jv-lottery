package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;

    private final Random random = new Random();

    public String getRandomColor() {
        index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
