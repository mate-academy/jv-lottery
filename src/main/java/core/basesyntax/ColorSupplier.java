package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final int indexRandom = new Random().nextInt(Colors.values().length);

    public String getRandomColor() {
        return String.valueOf(Colors.values()[indexRandom]);
    }
}
