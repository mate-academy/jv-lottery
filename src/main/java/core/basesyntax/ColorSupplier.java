package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int value = new Random().nextInt(6);

        for (Color color : Color.values()) {
            if (color.getNumber() == value) {
                return color.name();
            }
        }
        return null;
    }
}
