package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int maxNumber = Color.values().length - 1;
        return new String(String.valueOf(Color.values()[(new Random().nextInt(maxNumber))]));
    }
}
