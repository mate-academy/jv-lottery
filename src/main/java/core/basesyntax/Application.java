package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < 3; i++) {
            StringBuilder resultOf3 = new StringBuilder();
            resultOf3.append(i + 1);
            resultOf3.append(": ");
            resultOf3.append(lottery.getRandomBall().getNumber());
            resultOf3.append(lottery.getRandomBall().getColor());
            System.out.println(resultOf3.toString());
        }
    }
}
