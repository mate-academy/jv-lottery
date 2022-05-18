package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lot = new Lottery();
        Ball ball1 = lot.getRandomBall();
        Ball ball2 = lot.getRandomBall();
        Ball ball3 = lot.getRandomBall();
        Ball[] balls = new Ball[]{ball1, ball2, ball3};
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
