package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int randomInt = random.nextInt(BallColors.values().length); // random integer in length of number of BallColor
                                                                    // values
        return BallColors.values()[randomInt].name();
    }
}
