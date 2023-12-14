package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final int index = random.nextInt(StackColor.values().length);

    public String getRandomColor() {
        return StackColor.values()[index].name();
    }
}
