package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public ColorOfBall getRandomColor() {
        int index = new Random().nextInt(ColorOfBall.values().length);
        return ColorOfBall.values()[index];
    }
}
