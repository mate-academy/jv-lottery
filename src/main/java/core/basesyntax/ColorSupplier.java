package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColor = new Random().nextInt(BallColor.values().length);
        return BallColor.values()[randomColor].toString();
    }
}
