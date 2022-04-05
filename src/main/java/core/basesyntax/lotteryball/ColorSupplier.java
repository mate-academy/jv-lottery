package core.basesyntax.lotteryball;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    Random r = new Random();

    public String getRandomColor() {
        int index = r.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
