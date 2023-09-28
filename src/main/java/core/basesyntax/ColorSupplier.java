package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] allColors;

    public ColorSupplier() {
        allColors = Colors.values();
    }

    public String getRandomColor() {
        int index = new Random().nextInt(allColors.length);
        return allColors[index].getColor();
    }
}
