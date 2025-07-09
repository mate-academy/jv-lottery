package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public void getRandomBall() {
        Random random = new Random();
        setColor(ColorSupplier.getRandomColor());
        setNumber(random.nextInt(100));
        System.out.println("Ball's color is: " + getColor() + ", ball's number is: " + getNumber());
    }
}
