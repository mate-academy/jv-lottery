package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Color[] COLORS = Color.values();
    private final Random RANDOM = new Random();

    public Color getRandomColor() {

        int index = RANDOM.nextInt(COLORS.length);
        return COLORS[index];
    }

}
