package core.basesyntax;

public class Application {
    public static final int BALL_NUM = 3;

    public static void main(String[] args) {
        Lottery loterry = new Lottery();
        for (int i = 0; i < BALL_NUM; i++) {
            System.out.println(loterry.getRandomBall());
        }
    }
}
