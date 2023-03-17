package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    int boundNumber=100;
    public Ball getRandomBall(){
        int randomNumber = random.nextInt(boundNumber);
        return new Ball(new ColorSupplier().getRandomColor(), randomNumber);
    }
}
