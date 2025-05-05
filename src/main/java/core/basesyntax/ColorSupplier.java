package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int index;

    public String getRandomColor() {
        index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
