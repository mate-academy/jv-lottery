package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Application {
    public static void main(String[] args) {
        String firstBall = getRandomBall();
        String secondBall = getRandomBall();
        String thirdBall = getRandomBall();
    }
}
