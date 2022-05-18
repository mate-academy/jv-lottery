package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static final int COLORS_AMOUNT = Colors.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS_AMOUNT);
        return Colors.values()[index].toString();
    }
}
