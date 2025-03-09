package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < lottery.getNumberOfBalls(); i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
