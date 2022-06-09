package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Ball ball = new Lottery().getRandomBall();
            System.out.println(ball);
        }
    }
}
