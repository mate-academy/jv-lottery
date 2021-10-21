package core.basesyntax;

public class Application {

    static final int constant = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < constant; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
