package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
