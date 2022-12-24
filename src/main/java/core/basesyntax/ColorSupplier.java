package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomIndex = new Random();

    public String getRandomColor() {
        int randomIndexInt = randomIndex.nextInt(Color.values().length);
        return Color.values()[randomIndexInt].name();
    }
}

