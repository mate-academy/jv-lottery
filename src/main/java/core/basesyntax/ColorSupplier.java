package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    int index = random.nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[index].toString();
    }
}
