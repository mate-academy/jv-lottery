package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int ballCounter = 0; ballCounter < 3; ballCounter++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
