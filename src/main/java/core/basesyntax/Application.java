package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println("--- LOTTERY DRAW ---");

        // Створюємо та виводимо три кульки
        Ball ball1 = lottery.getRandomBall();
        System.out.println("Draw 1: " + ball1);

        Ball ball2 = lottery.getRandomBall();
        System.out.println("Draw 2: " + ball2);

        Ball ball3 = lottery.getRandomBall();
        System.out.println("Draw 3: " + ball3);
    }
}
