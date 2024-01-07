package core.basesyntax;

public class Application {
    private final static Lottery LOTTERY = new Lottery();

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ball №" + i + ": " + LOTTERY.getRandomBall().toString());
        }
    }
}
