package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int getRandomNumber() {
        return new Random().nextInt(100);
    }

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Ball ball = new Ball();
        Colors randomColor = color.getRandomColor();
        ball.setColor(randomColor);
        int randomNumber = getRandomNumber();
        ball.setNumber(randomNumber);
        return ball;
    }
}
