package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int randomColor = random.nextInt(Color.values().length);
        Color color = Color.values()[randomColor];
        return color.toString();
    }
}
