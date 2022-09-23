package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        return String.valueOf(Color.values()[index]);
    }
}
