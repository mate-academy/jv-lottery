package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random numberOfColor = new Random();

    public String getRandomColor() {
        return Colors.values()[numberOfColor.nextInt(Colors.values().length)].name();
    }
}
