package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomNumber = new Random().nextInt(Colors.values().length);
        Colors value = Colors.values()[randomNumber];
        return value.toString();
    }
}
