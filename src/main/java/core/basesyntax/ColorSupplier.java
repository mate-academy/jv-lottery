package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int colorLength = Color.values().length;
        Random colorBall = new Random();
        int index = colorBall.nextInt(colorLength);
        return Color.values()[index];
    }
}
