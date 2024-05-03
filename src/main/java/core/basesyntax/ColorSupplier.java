package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int randomColor = new Random().nextInt(Color.values().length);

    public void setRandomColor(int randomColor) {
        this.randomColor = randomColor;
    }

    public Color getRandomColor() {
        return Color.values()[randomColor];
    }

}
