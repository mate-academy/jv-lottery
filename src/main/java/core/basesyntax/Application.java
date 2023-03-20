package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final Ball[] balls = new Ball[3];
        final Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
