package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(); // Створюємо екземпляр Lottery

        Ball ball1 = lottery.getRandomBall(); // Отримуємо першу кулю
        Ball ball2 = lottery.getRandomBall(); // Отримуємо другу кулю
        Ball ball3 = lottery.getRandomBall(); // Отримуємо третю кулю

        System.out.println(ball1); // Виводимо інформацію про кулі
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
