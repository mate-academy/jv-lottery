package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier randColor = new ColorSupplier();
        Random num = new Random();
        int randomNumber = num.nextInt(100);
        Ball ball = new Ball();
        ball.setColor(randColor.getRandomColor());
        ball.setNumber(randomNumber);
        return ball.getColor() + " " + ball.getNumber();
    }
}
