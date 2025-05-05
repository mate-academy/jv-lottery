package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(Random random) {
        // random integer in length of number of BallColor
        // values
        int randomInt = random.nextInt(BallColors.values().length);
        return BallColors.values()[randomInt].name();
    }
}
