package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int number = new Random().nextInt(Color.values().length);
        return String.valueOf(Color.values()[number]);
    }
}
