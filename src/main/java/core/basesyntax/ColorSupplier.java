package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return String.valueOf(Color.valuesOf()[index]);
    }
}


//implement method String getRandomColor() in class ColorSupplier.
// This method should return a random color, based on the enum values (use Random class for this)