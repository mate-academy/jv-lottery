package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_BALL = 100;
    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }

    public int getRandomNumber() {
        return random.nextInt(NUMBER_OF_BALL);
    }
}
