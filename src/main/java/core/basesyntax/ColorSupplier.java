package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colours getRandomColor() {
        int i = random.nextInt(Colours.values().length);
        return Colours.values()[i];
    }
}
