package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++) {
            System.out.println(new Lottery().getRandomBall().toString());
        }
    }
}
