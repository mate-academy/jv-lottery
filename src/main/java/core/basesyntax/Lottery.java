package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random(); //it is class level?

    public Ball getRandomBall() {
        int maxNumber = 100;
        int ballNumber = random.nextInt(maxNumber);
        ColorSupplier colorSupplier = new ColorSupplier();
        Color ballColor = colorSupplier.getRandomColor();
        return new Ball(ballColor, ballNumber);
    }
}
