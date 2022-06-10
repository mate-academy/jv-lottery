package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Lottery().getRandomBall();
        for (int i = 0; i < 3; i++) {
            System.out.println(ball);
        }
    }
}
