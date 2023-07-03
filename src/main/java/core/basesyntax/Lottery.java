package core.basesyntax;

import java.util.Random;

public class Lottery {

    public String getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        ColorSupplier color = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(color.getRandomColor());
        ball.setNumber(number);
        return "Your ball is " + ball.getColor() + " and has number " + ball.getNumber();
    }
}
