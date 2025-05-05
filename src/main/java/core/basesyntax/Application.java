package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.suppliers.BallService;

public class Application {
    public static void main(String[] args) {
        BallService ballService = new BallService();
        int numberOfBalls = 3;
        Ball[] balls = ballService.createBalls(numberOfBalls);
        ballService.printBalls(balls);
    }
}
