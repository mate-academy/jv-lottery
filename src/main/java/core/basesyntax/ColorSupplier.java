package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    public String getRandomColor() {
        int maxNumber = Color.values().length - 1;
        return new String(Color.values()[(random.nextInt(maxNumber))].name());
    }
}
