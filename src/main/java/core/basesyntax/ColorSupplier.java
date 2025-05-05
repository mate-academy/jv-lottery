package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final Color[] color = Color.values();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return color[index].name();
    }
}
