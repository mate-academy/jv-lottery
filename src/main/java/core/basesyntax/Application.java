package core.basesyntax;

public class Application {
    private static final Ball[] balls = new Ball[3];

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
