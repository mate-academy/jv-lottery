package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Ball[] winners = new Ball[100];

        for (int i = 0; i < winners.length; i++) {
            Ball winner = Lottery.getRandomBall();
            winners[i] = winner;
        }
        System.out.println("\n Lucky balls today is: \n" + Arrays.toString(winners));
    }
}
