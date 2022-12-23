package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        Color value = Color.values()[index];
        return value.name();
    }
}
