package core.basesyntax;

import java.util.Random;

public class BallColorSupplier {
    private Random randomNumberGenerator = new Random();

    public String getRandomColor() {
        int randomColorIndex = randomNumberGenerator.nextInt(Color.values().length);

        return Color.values()[randomColorIndex].name().toLowerCase();
    }
}
