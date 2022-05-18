package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery firstBall = new Lottery(random,colorSupplier);
        Lottery secondBall = new Lottery(random,colorSupplier);
        Lottery thirdBall = new Lottery(random,colorSupplier);
        Lottery [] arrayOfBalls = {firstBall, secondBall, thirdBall};
        for (Lottery ball:arrayOfBalls) {
            System.out.println(ball.getRandomBall());
        }
    }
}
