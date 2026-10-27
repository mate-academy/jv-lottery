package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    protected static final int COLORS_LENGTH = Color.values().length;
    protected static final Random RANDOM = new Random();

    public String getRandomColor() {
        int index = RANDOM.nextInt(COLORS_LENGTH);
        return Color.values()[index].name();
    }
}
