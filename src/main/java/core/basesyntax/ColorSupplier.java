package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random randomColor;
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setRandomColor(Random randomColor) {
        this.randomColor = randomColor;
    }

    public Colors getRandomColor() {
        randomColor = new Random();
        index = randomColor.nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
