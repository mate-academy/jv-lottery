package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int random1 = random.nextInt(Colors.values().length);
        return (Colors.values()[random1]).name();
    }
}
