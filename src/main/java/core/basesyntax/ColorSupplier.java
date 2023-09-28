package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Colors[] allColors = Colors.values();

    public String getRandomColor() {
        int index = random.nextInt(allColors.length);
        return allColors[index].getColor();
    }
}
