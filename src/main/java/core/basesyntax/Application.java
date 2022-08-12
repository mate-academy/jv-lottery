package core.basesyntax;

import java.util.Random;

public class Application{
    public static void main(String[] args) {
        final int NUMBER_OF_BALLS = 3;
        Lottery ballLot = new Lottery();
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(ballLot.getRandomBall());
        }
    }
}
