package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int ranodmNumber = new Random().nextInt(101);
        Ball randomBall = new Ball(new ColorSupplier().getRandomColor(), ranodmNumber);
        return  randomBall;
    }
}

