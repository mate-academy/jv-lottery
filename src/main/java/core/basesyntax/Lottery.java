package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public int getRandomBall() {
        Ball ball = new Ball();

        colorSupplier.getRandomColor();

        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(100));

        System.out.println(ball.getColor() + " " + ball.getNumber() + "\n");
        return ball.getNumber();
    }
}
