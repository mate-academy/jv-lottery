package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball first = new Ball("Red", 34);
        Ball second = new Ball("Blue", 22);
        Ball third = new Ball("Green", 98);
        Lottery getOurBall = new Lottery();
        Ball[] balls = new Ball[3];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = getOurBall.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
