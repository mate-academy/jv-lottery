package core.basesyntax;

public class Application {
    static final int BALL_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for(int i =0; i < BALL_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
