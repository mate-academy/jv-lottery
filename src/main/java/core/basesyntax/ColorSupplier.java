package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_COLOR_INDEX = Color.values().length;
    private final int colorIndex = new Random().nextInt(MAX_COLOR_INDEX);
    private final Color colorBall = Color.values()[colorIndex];

    public String getRandomColor() {
        return colorBall.name();
    }
}
