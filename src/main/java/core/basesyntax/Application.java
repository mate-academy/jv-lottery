package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Ball [] balls = new Ball[3];
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());

        for (Ball currentBall : balls) {
            currentBall = lottery.getRandomBall();
            System.out.println(currentBall);
        }
    }
}
