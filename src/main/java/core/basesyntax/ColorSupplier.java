package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] values = Color.values();
        int randomColor = new Random().nextInt(Color.values().length);
        return values[randomColor].name();
        //return Color.values()[new Random().nextInt(Color.values().length)].name();
    }
}
