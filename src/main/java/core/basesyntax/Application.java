package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int Balls_Number = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < Balls_Number; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
