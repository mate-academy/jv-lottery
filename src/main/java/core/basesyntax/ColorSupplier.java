package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int colorLength = Color.values().length;

    public String getRandomColor() {
        int index = random.nextInt(colorLength);
        return Color.values()[index].name();
    }
}
