package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int Lottery_Balls = 3;
        Lottery lottery = new Lottery();

        for (int i = 0; i < Lottery_Balls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
