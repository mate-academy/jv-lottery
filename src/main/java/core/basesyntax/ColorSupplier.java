package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int randomNumber = random.nextInt(Color.values().length);
        return Color.values()[randomNumber].name();
    }
}
