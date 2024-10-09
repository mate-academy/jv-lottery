package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomNumber = new Random();

    public String getRandomColor() {
        int randomIndex = randomNumber.nextInt(Color.values().length);
        return Color.values()[randomIndex].name();
    }
}
