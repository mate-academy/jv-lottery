package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(101);
        return new Ball(randomColor,randomNumber);
    }

}

