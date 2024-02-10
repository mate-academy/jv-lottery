package core.basesyntax;

import enums.Colors;
import java.util.Random;

public class ColorSupplier {
    private int colorIndex;

    public ColorSupplier() {
        this.colorIndex = new Random().nextInt(Colors.values().length);
    }

    public String getRandomColor() {
        return Colors.values()[getColorIndex()].toString();
    }

    public int getColorIndex() {
        return colorIndex;
    }
}
