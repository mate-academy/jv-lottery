package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(Object colors) {
        colors = null;
        Random random = new Random();
        return random.toString();
    }
}
