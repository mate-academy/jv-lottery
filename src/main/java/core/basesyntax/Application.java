package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int Balls_Counter = 3;

        for (int i = 0; i < Balls_Counter; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
