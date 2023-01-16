package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;

    public String getRandomColor() {
        Color [] arrayColors = Color.values();
        index = new Random().nextInt(arrayColors.length);
        return arrayColors[index].name();
    }
}
