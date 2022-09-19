package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(String.valueOf(supplier.getRandomColor()));
        Random number = new Random();
        ball.setNumber(number.nextInt(100));
        return "Color is: " + ball.getColor() + "\n" + "Number is: " + ball.getNumber();
    }
}
