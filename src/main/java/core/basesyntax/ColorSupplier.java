package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public String getRandomColor() {
        int i = random.nextInt(Color.values().length);
        return Color.values()[i].name();
    }
}
