package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int BALLS_COUNT = 3;
        Ball[] winners = new Ball[BALLS_COUNT];
        Lottery lottery = new Lottery();

        for (int i = 0; i < BALLS_COUNT; i++) {
            Ball winner = lottery.getRandomBall();
            winners[i] = winner;
        }
        System.out.println("\n Lucky balls today is: \n" + Arrays.toString(winners));
    }
}
