package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random randomIndex = new Random();
    int randomIndexInt = randomIndex.nextInt(Colors.values().length);

    public String getRandomColor() {
        return Colors.values()[randomIndexInt].name();
    }
}

