package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.suppliers.BallSupplier;

public class Application {
    public static void main(String[] args) {
        BallSupplier ballSupplier = new BallSupplier();
        Ball[] balls = ballSupplier.createBalls(3);
        ballSupplier.printBalls(balls);
    }
}
