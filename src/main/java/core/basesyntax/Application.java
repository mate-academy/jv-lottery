package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int magicNumber = 3;

        for (int i = 0; i < magicNumber; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
