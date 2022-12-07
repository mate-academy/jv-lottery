package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        new Random();
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ball number " + (i + 1) + ": " + lottery.getRandomBall() + ".");
        }
    }
}
