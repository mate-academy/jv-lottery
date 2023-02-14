package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] getColor = Color.values();
        int index = new Random().nextInt(getColor.length);
        return getColor[index].name();
    }
}
