package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int numberOfBalls = 40; //для прикладу тільки
        if (numberOfBalls > 100 || numberOfBalls <= 0) {
            System.out.println("Не правильно введено кількість кульок. Введіть число від 1 до 100");
        } else {
            for (int i = 0; i < numberOfBalls; i++) {
                Ball ball = lottery.getRandomBall();
                System.out.println(ball);
            }
        }
    }
}
