package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        DifferentColor[] allColor = DifferentColor.values();
        int randomColorNumber = new Random().nextInt(allColor.length);
        return allColor[randomColorNumber].toString();
    }
}
