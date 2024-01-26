package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}
