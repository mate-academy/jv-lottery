package core.basesyntax;

import java.util.Random;

public class Lottery {
    static Random randomNumber = new Random();
    public static Ball getRandomBall() {
        Ball rundomBall;
        rundomBall = new Ball(ColorSupplier.getRandomColor(), randomNumber.nextInt(100));
        return rundomBall;
    }
}
