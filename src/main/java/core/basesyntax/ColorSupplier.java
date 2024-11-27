package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
     String randomColor = getRandomColor();

    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
