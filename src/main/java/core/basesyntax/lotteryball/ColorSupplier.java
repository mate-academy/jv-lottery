package core.basesyntax.lotteryball;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random;

    ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
