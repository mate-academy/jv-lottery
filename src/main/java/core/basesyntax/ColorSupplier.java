package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        int number = random.nextInt(4);
        return Color.values()[number];
    }
}
