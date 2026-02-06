package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(BaseColors.values().length);
        return BaseColors.values()[index].name();
    }
}
