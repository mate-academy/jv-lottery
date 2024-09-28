package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier randomColor = new ColorSupplier();
    Random randomNum = new Random();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        int boundOfRandomNumbers = 100;

        randomBall.setNumber(randomNum.nextInt(boundOfRandomNumbers));
        randomBall.setColor(randomColor.getRandomColor());

        return randomBall;
    }


}
