package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random rand = new Random();

    public String getRandomColor() {
        int index = rand.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
