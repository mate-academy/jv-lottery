package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors randomColor = Colors.values()[index];
        return randomColor.name();
    }
}
