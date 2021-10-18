package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random random = new Random();
        return Colors.values()[random.nextInt(Colors.values().length)].getColor();
    }
}
