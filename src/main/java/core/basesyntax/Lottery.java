package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Random randomizer = new Random();

    public Ball getRandomBall() {
        Ball randomball = new Ball();
        randomball.setNumber(randomizer.nextInt(100));
        randomball.setColor((new ColorSupplier()).getRandomColor());
        return randomball;
    }
}
