package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int random = new Random().nextInt(RandomColors.values().length);
        return RandomColors.values()[random].toString();
    }
}
