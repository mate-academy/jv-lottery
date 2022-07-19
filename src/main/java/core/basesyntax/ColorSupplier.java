package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random randomColor = new Random();
    public String getRandomColor() {
        int index = randomColor.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
