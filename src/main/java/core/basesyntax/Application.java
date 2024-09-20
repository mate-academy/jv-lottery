package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            if (ball == null) {
                throw new IllegalArgumentException("Invlaid value");
            }
            System.out.println(ball);
        }
    }
}


