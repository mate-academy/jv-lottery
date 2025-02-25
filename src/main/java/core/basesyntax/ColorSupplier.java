package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Ball ball = new Ball();
        Random rand = new Random();
        return ball.getColorByIndex(rand.nextInt(7));
    }
}
