package core.basesyntax;

import java.util.Random;


public class Lottery  {

    Random random = new Random();
    ColorSupplier randomColor = new ColorSupplier();
    int numberOfBall = random.nextInt(99);
    String color = randomColor.getRandomColor();
    public Ball getRandomBall () {
        return new Ball(color, numberOfBall);
    }
}
