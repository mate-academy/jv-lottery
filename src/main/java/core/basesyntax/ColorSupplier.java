package core.basesyntax;

import core.basesyntax.classes.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int index = random.nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[index].name();
    }
}
