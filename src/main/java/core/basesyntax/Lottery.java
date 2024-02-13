package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Color randomColor = ColorSupplier.getRandomColor();
        return new Ball(randomColor.toString(), randomNumber);
    }

}
