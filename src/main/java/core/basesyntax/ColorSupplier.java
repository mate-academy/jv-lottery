package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int numberOfColors = Color.values().length;

    public String getRandomColor() {
        int index = random.nextInt(numberOfColors);
        return Color.values()[index].toString();
    }
}
