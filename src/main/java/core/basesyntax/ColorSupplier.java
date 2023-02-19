package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int BALL_COLOR = 5;
    private Random random = new Random();

    public Color getRandomColor() {
        int ball = random.nextInt(BALL_COLOR);
        return Color.values()[ball];
    }
}
