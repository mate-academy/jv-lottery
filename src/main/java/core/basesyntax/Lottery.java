package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random randomNumber = new Random();
    private final ColorSupplier colors = new ColorSupplier();

    public void getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colors.getRandomColor());
        ball.setNumber(randomNumber.nextInt(101));
        System.out.println(ball);

    }
}
