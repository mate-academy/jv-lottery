package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int colorValuesLength = Color.values().length;

    public String getRandomColor() {
        int index = random.nextInt(colorValuesLength);
        return Color.values()[index].toString();
    }
}
