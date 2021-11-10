package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Colors.values().length);

    public String getRandomColor() {
        return "" + Colors.values()[index].name();
    }
}
