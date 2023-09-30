package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random colorRandom = new Random();
    private int colorInt = colorRandom.nextInt(Colors.values().length);

    public String getRandomColor() {
        return Colors.values()[colorInt].toString();
    }
}
