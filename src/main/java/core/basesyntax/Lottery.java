package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int ballMaxNumber = 100;

    public  Ball getRandomBall() {

        return new Ball(new Random().nextInt(ballMaxNumber), ColorSupplier.getRandomColor());
    }
}
