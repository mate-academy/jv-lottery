package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    String getRandomColor() {
        Random random = new Random();
        int randomIndex = random.nextInt(BallColor.values().length);
        return String.valueOf(BallColor.values()[randomIndex]);
    }
}
