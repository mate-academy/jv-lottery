package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // Створюємо три кулі випадкового кольору
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
