package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int i = new Random().nextInt(ColorsCollection.values().length);
        return ColorsCollection.values()[i].toString();
    }
}
