package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();
    public String getRandomColor() {
        return Color.values()[RANDOM.nextInt(Color.values().length)].toString();
    }
}
