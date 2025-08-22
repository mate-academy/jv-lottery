package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    final String getRandomColor() {
        Random random = new Random();
        int ballId = random.nextInt(Colors.values().length);
        return Colors.values()[ballId].toString();
    }
}
