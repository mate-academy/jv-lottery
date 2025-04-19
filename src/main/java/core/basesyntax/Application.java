package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();  // Правильне ім'я класу

        // Створюємо 3 випадкових м'ячі
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();

        // Виводимо інформацію про м'ячі
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
