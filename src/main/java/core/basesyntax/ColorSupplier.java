package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public RandomColors getRandomColor() {
        int index = new Random().nextInt(RandomColors.values().length);
        return RandomColors.values()[index];
    }
}
