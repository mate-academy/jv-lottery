package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static int random;

    public String getRandomColor() {
        random = new Random().nextInt(Colors.values().length);
        return Colors.values()[random].name();
    }
}
