package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
// This method should return a random color, based on the enum values (use the Random class for this)