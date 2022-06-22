package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomNumber = new Random().nextInt(Colors.values().length);
        return Colors.values()[randomNumber].toString();
    }
}
