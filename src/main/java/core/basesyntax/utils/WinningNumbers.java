package core.basesyntax.utils;

import core.basesyntax.supplier.Lottery;

public class WinningNumbers {
    public static void nums() {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
