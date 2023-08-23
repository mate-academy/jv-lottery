package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        listOfColors[] colors = listOfColors.values();
        int indexOfColor = new Random().nextInt(colors.length);
        return colors[indexOfColor].toString();
    }

    public int getRandomINum() {
        return new Random().nextInt(101);
    }
}

