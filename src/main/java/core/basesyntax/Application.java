package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int ballsCount = 3;
        Ball[] winners = new Ball[ballsCount];
        Lottery lottery = new Lottery();

        for (int i = 0; i < ballsCount; i++) {
            Ball winner = lottery.getRandomBall();
            winners[i] = winner;
        }
        System.out.println("\n Lucky balls today are: \n" + Arrays.toString(winners));
    }
}
