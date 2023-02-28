package core.basesyntax;

public class Application {
    public static final Lottery lottery = new Lottery();

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ball " + i + ": " + lottery.getRandomBall());
        }
    }
}
