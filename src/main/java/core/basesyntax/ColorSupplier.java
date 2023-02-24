package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();

    public Color getRandomColor() {
        Color[] colorList = Color.values();
        return colorList[random.nextInt(colorList.length)];
    }
}
