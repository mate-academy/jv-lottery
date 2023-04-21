package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". " + lottery.getRandomBall());
        }
    }
}
