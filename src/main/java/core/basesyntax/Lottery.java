package core.basesyntax;

import java.util.Random;

public class Lottery {

    public String getRandomBall() {
        Ball ball = new Ball();
        Random randomNumber = new Random();
        Integer valueNumber = randomNumber.nextInt(100);
        ball.setNumber(valueNumber);
        ColorSupplier color = new ColorSupplier();
        ball.setColor(color.getRandomColor());
        return ball.toString();
    }
}
