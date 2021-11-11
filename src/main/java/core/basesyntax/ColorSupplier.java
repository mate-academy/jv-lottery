package core.basesyntax;
import java.util.Random;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomIndex = new Random().nextInt(Colors.values().length);
        String randomColor;
        randomColor = "" + Colors.values()[randomIndex];
        return randomColor;
    }
}