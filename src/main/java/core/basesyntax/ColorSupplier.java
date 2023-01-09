package core.basesyntax;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors [] arrayColors = Colors.values();
        int index = new Random().nextInt(arrayColors.length);
        return arrayColors[index].toString();
    }
}
