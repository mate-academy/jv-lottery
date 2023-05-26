package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private enum Color { Red, Orange, Yellow, Green, Blue }

    public String getRandomColor() {
        Color ballColor = Color.values()[new Random().nextInt(4)];
        return ballColor.toString();
    }
}
