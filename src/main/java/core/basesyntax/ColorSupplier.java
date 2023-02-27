package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Colors.values().length);
    private String result = Colors.values()[index].toString();

    public String getRandomColor() {
        return result;
    }
}
