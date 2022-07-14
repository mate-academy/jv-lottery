package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int numberOfColor = random.nextInt(BallColors.values().length);
        return BallColors.values()[numberOfColor].toString();
    }
}
