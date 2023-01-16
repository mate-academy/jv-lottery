package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    static int index;
    Color [] arrayColors = Color.values();
    public String getRandomColor() {
        index = new Random().nextInt(arrayColors.length);
        return arrayColors[index].name();
    }
}
