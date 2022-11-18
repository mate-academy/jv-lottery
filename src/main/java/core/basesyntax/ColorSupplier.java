package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    static int random;

    public String getRandomColor() {
        random = new Random().nextInt(Colors.values().length);
        return Colors.values()[random].name();
    }
}
