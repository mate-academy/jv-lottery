package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int randomColorNumber = random.nextInt(Color.values().length);
        Color[] colorList = Color.values();

        return colorList[randomColorNumber];
    }
}
