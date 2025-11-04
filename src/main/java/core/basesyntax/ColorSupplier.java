package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int randomIndexColor = random.nextInt(BallColors.values().length);

        return BallColors.values()[randomIndexColor].name();
    }
}
