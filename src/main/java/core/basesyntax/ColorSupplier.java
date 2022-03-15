package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        //int index = new Random().nextInt(Colors.values().length);
        //return Colors.values()[index].name();
        return Colors.values()[new Random().nextInt(Colors.values().length)].name();
    }
}
