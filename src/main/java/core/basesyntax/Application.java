package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int ballQuantity = 3;
        for (int i = 0; i < ballQuantity; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
