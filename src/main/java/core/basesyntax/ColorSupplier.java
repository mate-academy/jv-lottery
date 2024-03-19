package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color randomColor = Color.values()[index];
        return randomColor.toString();
    }
}
