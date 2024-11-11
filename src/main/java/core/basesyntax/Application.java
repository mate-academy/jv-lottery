package core.basesyntax;

public class Application {
    static int BALL_COUNT = 3;
    public static void main(String[] args) {
        for(int i =0; i < BALL_COUNT; i++) {
            System.out.println(Lottery.getRandomBall());
        }
    }
}
