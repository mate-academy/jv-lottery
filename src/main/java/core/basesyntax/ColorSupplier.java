package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Colors.values().length);

    public String getRandomColor() {
        Colors ballColor = Colors.values()[index];
        return ballColor.name();

    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}
