package core.basesyntax;

import java.util.Random;
import lottery.Color;

public class ColorSupplier {
    public String getRandomColor() {
        return Color.values()[(new Random().nextInt(Color.values().length))].toString();
    }
}
