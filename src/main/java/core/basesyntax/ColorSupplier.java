package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int ENUM_LENGTH_FOR_RANDOM = Color.values().length;
    protected Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(ENUM_LENGTH_FOR_RANDOM)].name();
    }
}
