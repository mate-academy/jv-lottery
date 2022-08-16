package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int randomNumber = RANDOM.nextInt(Color.values().length);
        return Color.values()[randomNumber].name();
    }
}


