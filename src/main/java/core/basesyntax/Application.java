package core.basesyntax;

import core.basesyntax.constructors.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery[] ball = new Lottery[3];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = new Lottery();
            System.out.println(ball[i].getRandomBall());
        }
    }
}
