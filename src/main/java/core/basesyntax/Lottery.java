package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorBall = new ColorSupplier();
        Random rndNum = new Random();
        Ball newBall = new Ball(colorBall.getRandomColor(), rndNum.nextInt(100));
        return newBall;
    }
}
