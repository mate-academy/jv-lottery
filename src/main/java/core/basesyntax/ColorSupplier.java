package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public ColorsEnum getRandomColor() {
        int index = random.nextInt(ColorsEnum.values().length);
        ColorsEnum color = ColorsEnum.values()[index];
        return color;
    }
}
