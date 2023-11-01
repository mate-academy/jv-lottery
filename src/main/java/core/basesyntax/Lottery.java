package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {

        Ball randomBall = new Ball();
        String color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(100);
        randomBall.setColor(color);
        randomBall.setNumber(number);
        return randomBall;
    }
}
