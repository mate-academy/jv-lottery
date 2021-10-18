package core.basesyntax.supplier;

import core.basesyntax.utils.Colors;
import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();

    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
