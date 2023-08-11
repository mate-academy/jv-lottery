package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Ball ball = new Ball();

    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        ball.setColor(ball.toString(Colors.values()[index]));
        return ball.getColor();
    }

}
