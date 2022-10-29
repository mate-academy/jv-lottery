package core.basesyntax;

public class Application {
    private static final int NumberOfBall = 4;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[NumberOfBall];
        for (int i = 0; i < balls.length; i++) {
            System.out.println(lottery.getRandomBall());
        }

    }
}
