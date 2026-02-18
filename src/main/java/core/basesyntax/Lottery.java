package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomNum = new Random().nextInt(100);
        Color randomColor = new ColorSupplier().getRandomColor();
        Ball result = new Ball();
        result.color = randomColor;
        result.number = randomNum;
        return result ;
    }
}
