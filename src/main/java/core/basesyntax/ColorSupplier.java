package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] allColors = Colors.values();
    Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(allColors.length);
        return allColors[index].getColor();
    }
}
