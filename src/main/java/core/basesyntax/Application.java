package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println("ColorRanomOfEnum:" + colorSupplier.getRandomColorList());
        Lottery lottery = new Lottery();
        for (int i = 1; i < 4; i++) {
            System.out.println("NumberBall " + i + " :" + lottery.getRandomBall());
        }
    }
}

