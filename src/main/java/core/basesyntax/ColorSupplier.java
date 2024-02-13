package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int sizeOfEnum = Color.values().length;
        int indexOfReturnedColor = random.nextInt(sizeOfEnum);
        return Color.values()[indexOfReturnedColor];
    }
}
