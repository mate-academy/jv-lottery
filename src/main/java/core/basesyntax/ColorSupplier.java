package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColor = new Random().nextInt(Color.values().length);
        return String.valueOf(Color.values()[randomColor]);
    }
}
