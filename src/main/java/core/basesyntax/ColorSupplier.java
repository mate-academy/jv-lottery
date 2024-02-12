package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomNumberSupplier = new Random();

    public Color getRandomColor() {
        int sizeOfEnum = Color.values().length;
        int indexOfReturnedColor = randomNumberSupplier.nextInt(sizeOfEnum);
        return Color.values()[indexOfReturnedColor];
    }
}
