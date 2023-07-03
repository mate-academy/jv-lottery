package core.basesyntax;

import lottery.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery currentLottery = new Lottery();

        for (int i = 0; i < 3; ++i) {
            System.out.print(currentLottery.getRandomBall());
        }
    }
}
