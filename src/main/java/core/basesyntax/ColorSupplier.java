package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {

        Random random = new Random();
        int randomColor = random.nextInt(Colors.values().length);
        return Colors.values()[randomColor];
    }
}
