package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        int i = random.nextInt(Color.values().length);
        return String.valueOf(Color.values()[i]);
    }
}