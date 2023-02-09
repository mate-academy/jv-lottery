package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomIndex = new Random().nextInt(colors.values().length);
        return  colors.values()[randomIndex].toString();
    }
}
