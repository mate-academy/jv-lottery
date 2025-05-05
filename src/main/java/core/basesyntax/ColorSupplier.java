package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = BallsColors.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(NUMBER_OF_COLORS);
        return BallsColors.values()[randomIndex].name();
    }
}
