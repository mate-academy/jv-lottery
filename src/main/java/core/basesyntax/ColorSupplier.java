package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        Color color = Color.values()[index];
        return color.name();
    }

}
