package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Lottery {
    public String getRandomColor() {
        return null;
        int index = random.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name();
    }
}
