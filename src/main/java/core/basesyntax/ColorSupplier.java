package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    String color;
    public String getRandomColor() {
        int indexColors = new Random().nextInt(Colors.values().length);
        return Colors.values()[indexColors].toString();
    }
}
