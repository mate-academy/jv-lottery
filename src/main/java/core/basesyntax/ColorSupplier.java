package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random color = new Random();
        int index = color.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
