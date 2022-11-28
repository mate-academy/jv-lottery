package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {

        int value = new Random().nextInt(6);

        for (Color color : Color.values()) {
            if(color.number == value) {
                return color;
            }
        }
        return null;
    }
}
