package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColor = new Random().nextInt(BallColors.values().length);
        return BallColors.values()[randomColor].toString();
    }
}
