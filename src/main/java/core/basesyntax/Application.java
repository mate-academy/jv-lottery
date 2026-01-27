package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        // Цикл для створення та виведення 3 кульок
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            // Метод toString() у класі Ball спрацює автоматично при виведенні
            System.out.println(ball);
        }
    }
}
