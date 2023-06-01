package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random random = new Random();
        int randomColorNumber = random.nextInt(Colors.values().length);
        Colors[] colorsList = Colors.values();

        return colorsList[randomColorNumber];
    }
}
