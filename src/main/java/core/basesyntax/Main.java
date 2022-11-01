package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's begin our lottery!");
        System.out.println("Your balls are:");
        Lottery lottery = new Lottery();
        for (int i = 1; i < 4; i++) {
            System.out.println(i + ")" + lottery.getRandomBall());
        }
        System.out.println("Hope you win!");
    }
}
