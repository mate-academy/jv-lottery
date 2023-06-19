package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int randomOrdinal = random.nextInt(Color.values().length);
        for (Color color : Color.values()) {
            if (color.ordinal() == randomOrdinal) {
                return color.name();
            }
        }
        // unreachable, randomOrdinal will always be in range from 0 to (Color.values().length - 1)
        return "COLORLESS";
    }
}
