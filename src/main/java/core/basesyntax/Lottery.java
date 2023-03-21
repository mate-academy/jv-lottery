package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.setColor(color.getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        return "Number Ball: " + ball.getNumber() + " Color Ball: " + ball.getColor();
    }
}
