package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomcolor = new Random();

    public String getRandomColor() {
        int index = randomcolor.nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
