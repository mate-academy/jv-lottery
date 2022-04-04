package core.basesyntax;

import core.basesyntax.lotteryball.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[3];

        // Loop for easier out puts objects accessible by lottery array
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
            System.out.println(lottery[i].getRandomBall().toString());
        }
    }
}
