package core.basesyntax;

public class Application {
    private static final int countBalls = 4;

    public static void main(String[] args) {
        Lottery[] balls = new Lottery[countBalls];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery();
            System.out.println(balls[i].getRandomBall());
        }
    }
}
