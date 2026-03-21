package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball = new Lottery().getRandomBall();
        StringBuilder result = new StringBuilder();
        int index = 3;
        for (int i = 0; i < index; i++) {
            result.append(ball).append(" ");
            ball = new Lottery().getRandomBall();
        }
        System.out.println(result);
    }
}
