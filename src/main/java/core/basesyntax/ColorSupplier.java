package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return BaseColors.values()[this.random.nextInt(BaseColors.values().length)].name();
    }
}
