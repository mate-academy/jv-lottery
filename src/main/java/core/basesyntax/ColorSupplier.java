package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int numberOfColors = Color.values().length;
        int randIndex = random.nextInt(numberOfColors);
        return Color.values()[randIndex].toString();
    }
}
