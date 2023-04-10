package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = Lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
