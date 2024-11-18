package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(); // Створюємо об'єкт класу Lottery

        Ball ball1 = lottery.getRandomBall(); // Генеруємо першу кульку
        Ball ball2 = lottery.getRandomBall(); // Генеруємо другу кульку
        Ball ball3 = lottery.getRandomBall(); // Генеруємо третю кульку

        System.out.println(ball1); // Виводимо інформацію про першу кульку
        System.out.println(ball2); // Виводимо інформацію про другу кульку
        System.out.println(ball3); // Виводимо інформацію про третю кульку
    }
}
