package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    protected Random random = new Random();

    protected Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
