package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color color = null;
        return color.getValueByInt(new Random().nextInt(5)).toString();
    }
}
