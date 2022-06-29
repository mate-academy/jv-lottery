package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = (int) (Math.random() * 7);
        return Color.values()[index].toString();
    }
}
