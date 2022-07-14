package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random ran = new Random();
        int number = ran.nextInt(100);
        return new Ball(color, number);
    }
}
