package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_COUNT = ColorList.values().length;
    protected Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS_COUNT);
        return ColorList.values()[index].name().toLowerCase();
    }
}
