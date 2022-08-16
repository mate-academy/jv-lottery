package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        int ballsLength = balls.length;

        for (int i = 0; i < ballsLength; i++) {
            balls[i] = new Lottery().getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
