package core.basesyntax;

import java.util.Random;

public class ColorSupplier  {
    public static Ball.Color getRandomColor() {
        Ball.Color[] colors = Ball.Color.values();
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
