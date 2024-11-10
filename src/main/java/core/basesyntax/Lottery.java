package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall(){
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100)+1;
        return new Ball(randomColor,randomNumber);
    }
}
