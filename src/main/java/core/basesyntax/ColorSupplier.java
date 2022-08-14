package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int random = new Random().nextInt(Colors.values().length);
        return Colors.values()[random].toString();
    }
}
