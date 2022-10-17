package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand;

    public String getRandomColor() {
        int i = rand.nextInt(Color.values().length);
        return Color.values()[i].toString();
    }
}
