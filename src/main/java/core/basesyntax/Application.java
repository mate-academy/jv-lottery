package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball [] balls = new Ball[10];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getBall();
            System.out.println(balls[i]);
        }
    }
}
