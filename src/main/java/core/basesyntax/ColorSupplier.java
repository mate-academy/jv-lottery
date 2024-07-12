package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {

        Color[] colorValues = Color.values();
        Random rand = new Random();
        int randomIndex = rand.nextInt(colorValues.length);

        return colorValues[randomIndex].name();

    }
}
