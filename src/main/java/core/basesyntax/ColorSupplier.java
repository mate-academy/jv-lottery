package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setRandomColor(Random randomColor) {
        this.random = randomColor;
    }

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
