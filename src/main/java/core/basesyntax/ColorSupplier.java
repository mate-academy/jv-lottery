package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Color[] colors = Color.values();
        Color randomColor = colors[new Random().nextInt(colors.length)];
        return randomColor.toString();
    }
}
