package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends ColorBall {
    private final Color color = Color.values()[getIndex()];

    private final int getIndex() {
        return new Random().nextInt(Color.values().length);
    }

    public Color getColor() {
        return color;
    }

    public String getRandomColor() {
        return color.name();
    }
}
