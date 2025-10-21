package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandonBall() {
        int random = new Random().nextInt(100);
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();

        ball.setColor(Colors.valueOf(color.getRandomColor()));
        ball.setNumber(random);

        return ball;
    }
}
