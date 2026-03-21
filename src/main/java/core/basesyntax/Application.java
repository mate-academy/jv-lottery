package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball = new Lottery();
        StringBuilder result = new StringBuilder();
        final int ballsCount = 3;;
        for (int i = 0; i < ballsCount; i++) {
            result.append(ball).append(" ");
            ball.getRandomBall();
        }
        System.out.println(result);
    }
}
