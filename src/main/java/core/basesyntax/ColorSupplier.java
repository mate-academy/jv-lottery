package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }
}
