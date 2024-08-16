package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier supplier = new ColorSupplier();
        for(int i = 0; i < 3; i++) {
            Colors value = supplier.getRandomColor();
            System.out.println(value);
        }
        Lottery lottery = new Lottery();
        for(int i = 0; i < 3; i++) {
            int number = Lottery.getRandomBall();
            System.out.println(number);
        }
    }
}