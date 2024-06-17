package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;

    public String getRandomColor() {
        setIndex(index);
        Colors ballColor = Colors.values()[index];
        return ballColor.name();

    }

    public void setIndex(int index) {
        this.index = new Random().nextInt(Colors.values().length);;
    }

    public int getIndex() {
        return index;
    }

}
