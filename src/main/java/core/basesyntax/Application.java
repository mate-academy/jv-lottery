package core.basesyntax;

public class Application {
    static Lottery lottery = new Lottery();
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
