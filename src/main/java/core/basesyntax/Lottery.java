package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        ColorSupplier color= new ColorSupplier();
        int randomNumber = random.nextInt(100);
        Enum randomColor = color.getRandomColor();
        Ball ball = new Ball(randomColor, randomNumber);

        return ball.toString();
    }
}
