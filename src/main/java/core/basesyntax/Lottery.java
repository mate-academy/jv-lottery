package core.basesyntax;

import java.util.Random;

public class Lottery {
    private  final  static int amount = 100;
    public Ball getRandomBall(){
        return new Ball (new Random().nextInt(amount),
                new ColorSupplier().getRandomColor());
    }
}
