package core.basesyntax.ball;

import java.util.Random;

public class ColorSupplier {
    private int indexColor;

    public String getRandomColor() {
        indexColor = new Random().nextInt(Color.values().length);
        return Color.values()[indexColor].toString();
    }
}
