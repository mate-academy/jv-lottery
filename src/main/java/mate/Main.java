package mate;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " " + lottery.getRandomBall().toString());
        }
    }
}
