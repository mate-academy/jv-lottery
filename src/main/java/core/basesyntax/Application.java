package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Application {
    public static void main(String[] args) {
        System.out.println(getRandomBall());
        System.out.println(getRandomBall());
        System.out.println(getRandomBall());
    }
}
