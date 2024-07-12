package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {

        Colors[] colorValues = Colors.values();
        Random rand = new Random();
        int randomIndex = rand.nextInt(colorValues.length - 1);

        return String.valueOf(colorValues[randomIndex]);

    }
}
