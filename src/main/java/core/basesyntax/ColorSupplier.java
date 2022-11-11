package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(Color.values().length);
        return Color.values()[colorNumber].name();
    }
}
