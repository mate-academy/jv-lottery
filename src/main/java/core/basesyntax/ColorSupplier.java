package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(ColorsEnum.Colors.values().length);
        return ColorsEnum.Colors.values()[index].name();
    }
}

