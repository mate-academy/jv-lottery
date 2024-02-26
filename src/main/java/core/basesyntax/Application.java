package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 1; i <= 3; i++) {
            String ballNumber = String.valueOf(lottery.getRandomBall().getNumber());
            String ballCollor = lottery.getRandomBall().getColor();
            System.out.println("Ball " + i + " number :" + ballNumber + " color : " + ballCollor);
        }
    }
}
