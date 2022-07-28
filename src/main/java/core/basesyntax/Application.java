package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int iterations = 3;
        Ball[] balls = new Ball[iterations];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
