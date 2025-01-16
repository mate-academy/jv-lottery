package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int i = random.nextInt(ColorEnum.values().length);
        return ColorEnum.values()[i].name();
    }
}
