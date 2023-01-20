package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private Ball ball = new Ball();
    private ColorSupplier supplier = new ColorSupplier();

    public String getRandomBall() {
        StringBuilder builder = new StringBuilder();

        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(100));

        builder.append(ball.getColor()).append(" ").append(ball.getNumber());
        return builder.toString();
    }
}
