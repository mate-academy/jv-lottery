package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Ball randomBall = getRandomBall();
            System.out.println("Random ball: " + randomBall);
        }
    }
}
