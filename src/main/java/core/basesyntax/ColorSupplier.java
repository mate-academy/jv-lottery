package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors colors = Colors.values()[index];
        String string = colors.toString();
        return string;
    }
}
