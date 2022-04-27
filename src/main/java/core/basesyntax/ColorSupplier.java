package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int randomColorNumber = random.nextInt(Color.values().length);
        return String.valueOf(Color.values()[randomColorNumber]);
    }
}
