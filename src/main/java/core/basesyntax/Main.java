package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int cons = 3;
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[cons];
        for (int i = 0; i < balls.length; i++) {
            Ball ball = lottery.getRandomBall();
            balls[i] = ball;
            System.out.println(balls[i]);
        }
    }
}
