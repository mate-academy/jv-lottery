package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();
    private final Ball ball = new Ball();

    public String getRandomBall() {
        int number = random.nextInt(100);
        ball.setColor(color.getRandomColor());
        ball.setNumber(number);
        return ball.getColor() + ball.getNumber();
    }
}
