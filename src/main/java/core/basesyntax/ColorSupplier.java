package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Ball ball = new Ball();
        int index = new Random().nextInt(Colors.values().length);
        ball.setColor(ball.toString(Colors.values()[index]));
        return ball.getColor();
    }

}
