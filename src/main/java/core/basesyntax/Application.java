package core.basesyntax;

import static java.lang.System.out;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball randomBall = lottery.getRandomBall();
            out.println(randomBall.toString());
        }
    }
}
