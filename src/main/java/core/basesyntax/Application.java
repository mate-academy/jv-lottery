package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Application {
    public static void main(String[] args) {
        int countOfBalls = 4;
        for (int i = 1; i < countOfBalls; i++) {
            System.out.println("Ball" + i + ": " + getRandomBall());
        }
    }
}
