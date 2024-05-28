package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 100500; i++) {
            System.out.println("Ball " + (i + 1) + ": " + lottery.getRandomBall());
        }
    }
}
