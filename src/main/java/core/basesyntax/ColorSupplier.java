package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColor = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[randomColor]);
    }
}


