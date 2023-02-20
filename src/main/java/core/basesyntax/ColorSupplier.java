package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int BALL_COLOR = Color.values().length;

    public Color getRandomColor() {
        int index = new Random().nextInt(BALL_COLOR);
        return Color.values()[index];
    }
}
