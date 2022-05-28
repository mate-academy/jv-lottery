package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        BallColors[] colors = BallColors.values();
        Random random = new Random();
        return colors[random.nextInt(colors.length - 1)].toString();
    }
}
