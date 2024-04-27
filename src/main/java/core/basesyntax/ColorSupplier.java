package core.basesyntax;

import java.lang.Math;

public class ColorSupplier {

    public Colors getRandomColor() {
        return Colors.values()[(int) (Math.random() * Colors.values().length)];
    }
}
