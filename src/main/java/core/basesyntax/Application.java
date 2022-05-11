package core.basesyntax;

public class Application {
    public static final int MAX_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < MAX_COUNT; i++) {
            Ball ball = lottery.getRandomColor();
            System.out.println(ball);
        }
    }
}
