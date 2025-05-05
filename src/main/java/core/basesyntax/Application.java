package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random,colorSupplier);
        Ball firstBall = lottery.getRandomBall();
        System.out.println(firstBall);
        Ball secondBall = lottery.getRandomBall();
        System.out.println(secondBall);
        Ball thirdBall = lottery.getRandomBall();
        System.out.println(thirdBall);
    }
}
