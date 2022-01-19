package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery l = new Lottery();
        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = l.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
