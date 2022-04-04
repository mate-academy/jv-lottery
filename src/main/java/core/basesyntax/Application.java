package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        Lottery randomBall = new Lottery();

        for (int i = 0; i < 3; i++) {
            balls[i] = randomBall.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
