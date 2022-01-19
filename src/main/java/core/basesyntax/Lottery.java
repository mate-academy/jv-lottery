package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall(ColorSupplier colorSupplier) {
        Color color = colorSupplier.getRandomColor();
        Random random = new Random();
        int randomNum = random.nextInt(100);
        return new Ball(color,randomNum);
    }
}
