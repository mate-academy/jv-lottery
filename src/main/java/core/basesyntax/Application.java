package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int quantityBalls = 3;
        for (int i = 0; i < quantityBalls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
