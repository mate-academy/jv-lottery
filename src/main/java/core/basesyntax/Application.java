package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }

        for (int i = 0; i < balls.length; i++) {
            System.out.println("Ball №" + (i + 1) + " - " + balls[i]);
        }
    }
}
