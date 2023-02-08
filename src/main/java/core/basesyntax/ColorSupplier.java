package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(BollColors.values().length);
        return BollColors.values()[index].toString();
    }
}
