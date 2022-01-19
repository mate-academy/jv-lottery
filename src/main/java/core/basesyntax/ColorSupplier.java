package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int pick = new Random().nextInt(Collor.values().length);
        return Collor.values()[pick].toString();
    }
}
