package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public Colors getRandomColor() {
        int randomNum = new Random().nextInt(Colors.values().length);
        return Colors.values()[randomNum];
    }
}

