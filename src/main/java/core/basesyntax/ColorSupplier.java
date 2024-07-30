package core.basesyntax;

import ball.characteristics.Ball;
import ball.characteristics.Color;
import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Ball ball = new Ball();
        ball.setColor(Color.values()[index].toString());
        return ball.getColor();
    }
}
