package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball();
    private Random random = new Random();

    public int getRandomBall() {
        colorSupplier.getRandomColor();

        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(100));

        System.out.println(ball.getColor() + " " + ball.getNumber() + "\n");
        return ball.getNumber();
    }
}
