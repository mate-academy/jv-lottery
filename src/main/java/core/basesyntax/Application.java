package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int constant = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < constant; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
