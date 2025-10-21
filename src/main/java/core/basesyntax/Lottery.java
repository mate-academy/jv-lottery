package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandonBall() {
        int randomNumber = random.nextInt(100);
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();

        ball.setColor(Colors.valueOf(color.getRandomColor()));
        ball.setNumber(randomNumber);

        return ball;
    }
}
