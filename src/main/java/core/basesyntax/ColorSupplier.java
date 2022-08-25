package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        return String.valueOf(Color.values()[randomNumber]);
    }
}
