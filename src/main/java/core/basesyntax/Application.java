package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball = new Ball();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall(ball));
        }
    }
}
