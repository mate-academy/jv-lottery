package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random colorRandom = new Random();

    public String getRandomColor() {
        int colorIndex = colorRandom.nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}
