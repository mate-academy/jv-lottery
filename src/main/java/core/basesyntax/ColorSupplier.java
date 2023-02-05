package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colorsArray = Color.values();
    private Random random = new Random();

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(colorsArray.length);
        return colorsArray[randomColorIndex].name();
    }
}
