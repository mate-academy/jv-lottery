package core.basesyntax;

public class Application {
    private static Lottery lottery = new Lottery();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String color = colorSupplier.getRandomColor();
            System.out.println(lottery.getRandomBall(color));
        }
    }
}
