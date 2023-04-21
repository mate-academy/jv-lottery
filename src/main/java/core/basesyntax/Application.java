package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int balls = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
