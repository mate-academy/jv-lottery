package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery first = new Lottery();
        Lottery second = new Lottery();
        Lottery third = new Lottery();
        Lottery [] lottery = new Lottery[] {first, second, third};
        for (Lottery lotteries : lottery) {
            System.out.println(lotteries.getRandomBall());
        }
    }
}
