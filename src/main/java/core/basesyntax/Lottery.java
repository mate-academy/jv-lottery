package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(0, 101);
        ColorSupplier randomColor = new ColorSupplier();
        Colors colour = Colors.valueOf(randomColor.getRandomColor());
        String color = colour.toString();
        Ball randomBall = new Ball();
        randomBall.setColor(color);
        randomBall.setNumber(number);
        return randomBall;
    }
}
