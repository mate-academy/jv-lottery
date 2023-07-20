package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLORS_AMOUNT = 10;

    public String getRandomColor() {

        Random random = new Random();
        int index = random.nextInt(COLORS_AMOUNT);
        return Color.values()[index].name();
    }
}
