package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier color = new ColorSupplier();
    public String getRandomBall() {
        return random.nextInt(100) + " ball with color " + color.getRandomColor();
    }
}
