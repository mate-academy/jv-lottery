package core.basesyntax.ball;

import java.util.Random;

public class ColorSupplier {
    private int indexColor;
    Random random = new Random();

    public Color getRandomColor() {
        indexColor = random.nextInt(Color.values().length);
        return Color.values()[indexColor];
    }
}
