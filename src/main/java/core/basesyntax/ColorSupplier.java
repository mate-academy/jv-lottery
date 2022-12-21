package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomIndex = new Random();
    private final int randomIndexInt = randomIndex.nextInt(Colors.values().length);

    public String getRandomColor() {
        return Colors.values()[randomIndexInt].name();
    }
}

