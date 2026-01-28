package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {

        int randomInt = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[randomInt];
        return color.toString();
    }
}
