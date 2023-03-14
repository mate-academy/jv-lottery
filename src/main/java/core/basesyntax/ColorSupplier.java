package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return String.valueOf(Color.values()[index]);
    }
}
