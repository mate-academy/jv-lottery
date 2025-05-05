package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM_NUMBER = new Random();

    public String getRandomColor() {
        int index = RANDOM_NUMBER.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
