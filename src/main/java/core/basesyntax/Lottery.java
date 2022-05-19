package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.setColor(color.getRandomColor());
        Random random = new Random();
        int randomNum = random.nextInt(100);
        ball.setNumber(randomNum);
        return ball.toString();
    }
}
