package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rm = new Random();

    public int getRmInt(int rmInt) {
        return rm.nextInt(rmInt) + 1;
    }

    public String getRandomColor() {
        Colors[] values = Colors.values();
        int length = values.length;
        int randIndex = rm.nextInt(length);
        Colors colors = values[randIndex];
        return colors.toString();
    }
}
