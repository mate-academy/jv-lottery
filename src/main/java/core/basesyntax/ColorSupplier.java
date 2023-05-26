package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random generateRandomColor = new Random();

    public String getRandomColor() {
        int randIndex = generateRandomColor.nextInt(Color.values().length);
        return Color.values()[randIndex].name();
    }
}
