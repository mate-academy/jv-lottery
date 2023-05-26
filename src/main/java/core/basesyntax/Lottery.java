package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball.Color randomColor = ColorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        return new Ball(randomColor, randomNumber);
    }
}
