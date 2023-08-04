package core.basesyntax;

import java.util.Random;

public class Lottery {

    public String getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(100));
        return ball.getNumber() + "";
    }

    public String info() {
        ColorSupplier color = new ColorSupplier();
        return "Color of the ball - " + color.getRandomColor() + "\n" + "Ball number - "
                + getRandomBall();

    }
}
