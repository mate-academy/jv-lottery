package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random rand = new Random();

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), rand.nextInt(100));
    }
}
