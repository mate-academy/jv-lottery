package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random index = new Random();
    public String getRandomColor() {
        return Colors.values()[index.nextInt(Colors.values().length)].getTitle();
    }
}
