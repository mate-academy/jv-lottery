package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Lottery lottery = new Lottery();
        int index = lottery.index.nextInt(BaseColors.values().length);
        return BaseColors.values()[index].name();
    }
}
