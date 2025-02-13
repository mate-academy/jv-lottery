package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int i = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[i]);
    }
}
