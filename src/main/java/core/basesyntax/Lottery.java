package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        ColorSupplier cc = new ColorSupplier();
        int nn = new Random().nextInt(100);
        Ball Rand_ball = new Ball(nn, cc.getRandomColor());
        return Rand_ball;
    }
}
