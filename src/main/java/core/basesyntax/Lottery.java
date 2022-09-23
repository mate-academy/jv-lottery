package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        final int BOUND = 100;
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(random.nextInt(BOUND));
        return "Color is: " + ball.getColor() + "\n" + "Number is: " + ball.getNumber();
    }
}
