package core.basesyntax;

import core.basesyntax.constructors.Lottery;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
