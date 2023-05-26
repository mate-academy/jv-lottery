package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
/*Для тестирования программы в методе main () создайте три шара с помощью метода getRandomBall ()
из класса Lottery. И распечатать информацию о них в консоли.
 */
