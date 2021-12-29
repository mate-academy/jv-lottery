package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public int getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();

        colorSupplier.getRandomColor();

        setColor(colorSupplier.getRandomColor().toString());
        setNumber(new Random().nextInt(100));

        return getNumber();
    }
}

