package core.basesyntax;

import java.util.Random;

/**
 * @author dogmax296
 * @link https://github.com/dogmax296
 */
public class Lottery {

    public Ball getRandomBall(){
        Random random = new Random();
        int number = random.nextInt(100);

        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        return new Ball(color,number);
    }
}
