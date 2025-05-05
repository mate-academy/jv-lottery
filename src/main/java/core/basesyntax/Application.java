package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < Lottery.NUMBER_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
