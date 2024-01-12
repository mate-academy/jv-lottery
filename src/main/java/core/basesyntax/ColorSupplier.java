package core.basesyntax;

import core.basesyntax.lottery.Ball;
import core.basesyntax.lottery.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];

        Ball ball = new Ball();
        ball.setColor(color.toString());

        return ball.getColor();
    }
}
