package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(BallsColor.values().length);
        return BallsColor.values()[index].toString();
    }
}
