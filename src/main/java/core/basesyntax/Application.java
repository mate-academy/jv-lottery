package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.suppliers.BallSupplier;

public class Application {
    public static void main(String[] args) {
        BallSupplier ballSupplier = new BallSupplier();
        int numberOfBalls = 3;
        Ball[] balls = ballSupplier.createBalls(numberOfBalls);
        ballSupplier.printBalls(balls);
    }
}
