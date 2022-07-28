package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rnd = new Random();

    public String getRandomColor() {
        int index = rnd.nextInt(Color.values().length);
        return Color.values()[index].name();

    }
}
