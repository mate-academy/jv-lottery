package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_BALL_VALUE = 101;
    private Random random = new Random(); // when we creating this fields,
    // i think the instance of class takes more memory? But when we are using new
    // for creating sth like that(heap
    // memory) in methouds is it cleans when program ends or when the scope closed?

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_BALL_VALUE), colorSupplier.getRandomColor());
    }
}
