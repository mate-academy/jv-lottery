package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color color = Color.red;
        return color.getValueByInt(new Random().nextInt(5)).toString();
    }
}
