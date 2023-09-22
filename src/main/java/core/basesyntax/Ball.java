package core.basesyntax;

import java.util.Random;

public class Ball {
    private final String COLOR = new ColorSupplier().getRandomColor();
    private final int NUMBER = new  Random().nextInt(100);

    public String toString() {
        return COLOR + " ball by number " + NUMBER;
    }
}
