package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int k = 1; k < 4; k++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
