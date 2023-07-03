package lottery;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int randomIndexColor = (new Random().nextInt(Color.values().length));
        return Color.values()[randomIndexColor];
    }
}
