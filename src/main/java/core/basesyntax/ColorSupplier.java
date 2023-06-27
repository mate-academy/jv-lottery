package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        int index = new Random().nextInt(Colors.values().length);
        Colors randomColor = Colors.values()[index];
        return String.valueOf(randomColor);
    }

}
