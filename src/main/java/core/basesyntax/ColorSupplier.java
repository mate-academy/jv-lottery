package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(ColorsOfBall.values().length);
        return ColorsOfBall.values()[index].name();
    }
}
