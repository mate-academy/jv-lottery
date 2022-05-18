package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        Random r = new Random();
        int value = r.nextInt(100);
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(), value);


    }
}
