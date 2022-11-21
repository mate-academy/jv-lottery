package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        int index = new Random().nextInt((Colors.values().length));
        return Colors.values()[index];
    }
}

/*implement method getRandomColor() in class ColorSupplier.
This method should return a random color,
based on the enum values (use Random class for this)
 */
