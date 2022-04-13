package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int stepLottery = 3;

        Lottery lottery = new Lottery();
        for (int i = 0; i < stepLottery; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
