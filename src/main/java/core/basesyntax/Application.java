package core.basesyntax;

public class Application {
    private static int BALLS_LENGTH = 3;

    public static void main(String[] args) {
        Loterry loterry = new Loterry();
        while (BALLS_LENGTH > 0) {
            Ball ball = loterry.getRandomBall();
            System.out.println(ball.toString());
            BALLS_LENGTH--;
        }
    }
}
