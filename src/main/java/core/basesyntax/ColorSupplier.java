package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colors getRandomColor() {
        int randomColorNumber = random.nextInt(Colors.values().length);
        Colors[] colorsList = Colors.values();

        return colorsList[randomColorNumber];
    }
}
