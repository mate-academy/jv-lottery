package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Color[] colorList = Color.values();
        Random random = new Random();
        return colorList[random.nextInt(colorList.length)];
    }
}
