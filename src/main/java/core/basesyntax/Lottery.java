package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Colors getRandomBall() {
         ColorSupplier colorSupplier = new ColorSupplier();
            Colors randomColor = colorSupplier.getRandomColor();
        return randomColor;

    }
}


