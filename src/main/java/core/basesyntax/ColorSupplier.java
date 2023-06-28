package core.basesyntax;

import java.util.Random;
import lottery.Colors;

public class ColorSupplier {
    public String getRandomColor() {
        return Colors.values()[(new Random().nextInt(Colors.values().length))].toString();
    }
}
