package core.basesyntax;

public class Application {
    private static int count = 3;

    public static void main(String[] args) {
        while (count > 0) {
            Lottery winCar = new Lottery();
            System.out.println(winCar.getRandomBall());
            count--;
        }
    }
}
