package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier randomColor = new ColorSupplier();
        Random randomNum = new Random();

        randomBall.number = randomNum.nextInt(101);
        randomBall.color = randomColor.getRandomColor();

        return randomBall;
    }


}
