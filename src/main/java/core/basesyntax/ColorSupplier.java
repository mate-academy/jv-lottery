package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Random random = new Random();
    public String getRandomColor() {
        int randomColorNumber = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[randomColorNumber]);
    }
}
