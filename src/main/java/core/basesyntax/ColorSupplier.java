package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] Colors = Color.values();
    private static final Random Random = new Random();

    public String getRandomColor() {
        return Colors[Random.nextInt(Colors.length)].name();
    }
}
